package backend.service;

import backend.dto.request.CreateRequest;
import backend.dto.request.LoginRequest;
import backend.dto.request.UpdateRequest;
import backend.entity.User;
import lombok.RequiredArgsConstructor;
import backend.dto.response.UserReponse;
import org.modelmapper.ModelMapper;
import backend.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService, UserDetailsService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Page<UserReponse> getAllUsers(int page, int size, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(page, size, sort);
        return userRepository.findAll(pageable).map(user -> modelMapper.map(user, UserReponse.class));
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));
        if (user != null) {
            userRepository.deleteById(id);
        }
    }

    @Transactional
    @Override
    public void register(CreateRequest request) {
        User u = userRepository.findByUsername(request.getUsername());
        if (u != null) {
            throw new RuntimeException("Username has been used!");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setDepartment(request.getDepartment());
        user.setCity(request.getCity());

        userRepository.save(user);
    }

    @Transactional
    @Override
    public void create(CreateRequest request) {
        User u = userRepository.findByUsername(request.getUsername());
        if (u != null) {
            throw new RuntimeException("Username has been used!");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode("12345678"));
        user.setDepartment(request.getDepartment());
        user.setCity(request.getCity());

        userRepository.save(user);
    }

    @Override
    public UserReponse findById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found!"));
        return modelMapper.map(user, UserReponse.class);
    }

    @Transactional
    @Override
    public void update(Integer id, UpdateRequest request) {
        User user = userRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("User not found!"));

        if (!passwordEncoder.matches(request.getOldPassword(), user.getPassword())) {
            throw new BadCredentialsException("Your current password is incorrect!");
        }
        if (request.getUsername() != null) {
            User u = userRepository.findByUsername(request.getUsername());
            if (u != null && !u.getUsername().equals(user.getUsername())) {
                throw new RuntimeException("Username has been used!");
            }
            user.setUsername(request.getUsername());
        }

        if (request.getNewPassword() != null) {
            user.setPassword(passwordEncoder.encode(request.getNewPassword()));
        }

        if (request.getDepartment() != null) {
            user.setDepartment(request.getDepartment());
        }

        if (request.getCity() != null) {
            user.setCity(request.getCity());
        }

        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Username not found!");
        }
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new BadCredentialsException("Username not found!");
        }

        String authRole = "ROLE_" + user.getRole().name().toUpperCase();
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), List.of(new SimpleGrantedAuthority(authRole)));
    }
}
