package Assignments.Review.Service;

import Assignments.Review.DTO.Request.CreateAccountRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.Locale;

public interface IAccountService extends UserDetailsService {
    void createAccount(CreateAccountRequest createAccountRequest, Locale locale);
}
