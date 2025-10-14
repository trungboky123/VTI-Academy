package Assignments.Assignment_Lesson_9.Service;

import Assignments.Assignment_Lesson_9.DTO.Request.CreateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Request.UpdateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Response.AccountResponse;
import Assignments.Assignment_Lesson_9.Validation.AccountValidationRequest;
import org.springframework.data.domain.Page;
import java.util.Locale;

public interface IAccountService {
    void create(CreateAccountRequest createAccountRequest, Locale locale);
    Page<AccountResponse> getAll(AccountValidationRequest accountValidationRequest);
    void update(UpdateAccountRequest updateAccountRequest, Locale locale);
    void delete(Integer id, Locale locale);
}
