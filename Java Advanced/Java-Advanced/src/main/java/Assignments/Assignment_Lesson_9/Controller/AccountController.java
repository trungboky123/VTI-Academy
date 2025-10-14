package Assignments.Assignment_Lesson_9.Controller;

import Assignments.Assignment_Lesson_9.DTO.Request.CreateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Request.UpdateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Response.AccountResponse;
import Assignments.Assignment_Lesson_9.Service.IAccountService;
import Assignments.Assignment_Lesson_9.Validation.AccountValidationRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.Locale;

@RestController
@RequestMapping(value = "/accounts")
@Validated
@RequiredArgsConstructor
public class AccountController {
    private final IAccountService accountService;
    private final MessageSource messageSource;

    @PostMapping
    public ResponseEntity<?> createAccount(@RequestBody @Valid CreateAccountRequest createAccountRequest, Locale locale) {
        accountService.create(createAccountRequest, locale);
        return ResponseEntity.ok(messageSource.getMessage("account.created.successfully", null, locale));
    }

    @GetMapping
    public Page<AccountResponse> getAllAccounts(@Valid AccountValidationRequest accountValidationRequest) {
        return accountService.getAll(accountValidationRequest);
    }

    @PutMapping
    public ResponseEntity<?> updateAccount(@RequestBody @Valid UpdateAccountRequest updateAccountRequest, Locale locale) {
        accountService.update(updateAccountRequest, locale);
        return ResponseEntity.ok(messageSource.getMessage("account.updated.successfully", null, locale));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable Integer id, Locale locale) {
        accountService.delete(id, locale);
        return ResponseEntity.ok(messageSource.getMessage("account.deleted.successfully", null, locale));
    }
}
