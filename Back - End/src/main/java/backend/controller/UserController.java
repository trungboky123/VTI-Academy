package backend.controller;

import backend.configuration.JwtService;
import backend.dto.request.CreateRequest;
import backend.dto.request.LoginRequest;
import backend.dto.request.UpdateRequest;
import backend.entity.RefreshToken;
import backend.entity.User;
import backend.service.RefreshTokenService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import backend.dto.response.UserReponse;
import backend.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final RefreshTokenService refreshTokenService;
    private final UserDetailsService userDetailsService;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllUsers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir
    ) {
        Page<UserReponse> users = userService.getAllUsers(page, size, sortBy, sortDir);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Integer id) {
        UserReponse userReponse = userService.findById(id);
        return ResponseEntity.ok(userReponse);
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request, HttpServletResponse response) {
        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            User user = userService.findByUsername(userDetails.getUsername());

            String accessToken = jwtService.generateAccessToken(userDetails);
            RefreshToken refreshToken = refreshTokenService.createRefreshToken(user);

            Cookie cookie = new Cookie("refreshToken", refreshToken.getToken());
            cookie.setHttpOnly(true);
            cookie.setSecure(true);
            cookie.setPath("/users/auth/refresh");
            cookie.setMaxAge(7 * 24 * 60 * 60);

            response.addCookie(cookie);
            return ResponseEntity.ok(Map.of(
                    "accessToken", accessToken,
                    "message", "Login successfully!"));
        } catch (BadCredentialsException e) {
            throw new BadCredentialsException("Incorrect Password!");
        }
    }

    @PostMapping("/auth/refresh")
    public ResponseEntity<?> refresh(@CookieValue(value = "refreshToken", required = false) String refreshToken) {
        if (refreshToken == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "Refresh Token missing!",
                    "code", "NO_REFRESH_TOKEN"));
        }

        RefreshToken token = refreshTokenService
                .findByToken(refreshToken)
                .map(refreshTokenService::verifyExpiration)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid Refresh Token"));

        User user = token.getUser();
        UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
        String newAccessToken = jwtService.generateAccessToken(userDetails);

        return ResponseEntity.ok(Map.of("accessToken", newAccessToken));
    }

    @PostMapping("/auth/register")
    public ResponseEntity<?> register(@RequestBody CreateRequest request) {
        userService.register(request);
        return ResponseEntity.ok(Map.of("message", "Register successfully!"));
    }

    @PostMapping("/auth/logout")
    public ResponseEntity<?> logout(Authentication authentication, HttpServletResponse response) {
        User user = (User) authentication.getPrincipal();
        refreshTokenService.deleteByUserId(user.getId());

        Cookie cookie = new Cookie("refreshToken", null);
        cookie.setHttpOnly(true);
        cookie.setSecure(true);
        cookie.setPath("/users/auth/refresh");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        return ResponseEntity.ok("Logged out!");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody CreateRequest request) {
        userService.create(request);
        return ResponseEntity.ok(Map.of("message", "Create successfully!"));
    }

    @PreAuthorize("#id == authentication.principal.id")
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody UpdateRequest request) {
        userService.update(id, request);
        return ResponseEntity.ok(Map.of("message", "Update successfully!"));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id) {
        userService.delete(id);
        return ResponseEntity.ok(Map.of("message", "Removed successfully!"));
    }
}
