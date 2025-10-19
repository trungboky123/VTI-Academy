package Assignments.Review.Service;

import Assignments.Review.DTO.Request.CreateAccountRequest;
import Assignments.Review.Entity.Account;
import Assignments.Review.Repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final ModelMapper modelMapper;
    private final AccountRepository accountRepository;
    private final MessageSource messageSource;
    private final PasswordEncoder passwordEncoder;


    @Override
    @Transactional
    public void createAccount(CreateAccountRequest createAccountRequest, Locale locale) {
        Account account = modelMapper.map(createAccountRequest, Account.class);
        account.setPassword(passwordEncoder.encode(createAccountRequest.getPassword()));
        account.setCreateDate(LocalDate.now());
        accountRepository.save(account);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Locale locale = LocaleContextHolder.getLocale();
        Account account = accountRepository.findByUsername(username);
        if (account == null) {
            throw new UsernameNotFoundException(messageSource.getMessage("username.notfound", null, locale));
        }
        return new User(account.getUsername(), account.getPassword(), Collections.emptyList());
    }
}
