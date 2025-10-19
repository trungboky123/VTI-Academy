package Assignments.Review.Controller;

import Assignments.Review.DTO.Request.CreateAccountRequest;
import Assignments.Review.Service.IAccountService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping(value = "/accounts")
@RequiredArgsConstructor
@Validated
public class AccountController {
    private final IAccountService accountService;
    private final MessageSource messageSource;

    @PostMapping(value = "/register")
    public ResponseEntity<?> createAccount(@RequestBody @Valid CreateAccountRequest createAccountRequest, Locale locale) {
        accountService.createAccount(createAccountRequest, locale);
        return ResponseEntity.ok(messageSource.getMessage("account.created.successfully", null, locale));
    }

    @GetMapping(value = "/login")
    public String loginSuccessfully(Locale locale) {
        return messageSource.getMessage("login.successfully", null, locale);
    }
}
