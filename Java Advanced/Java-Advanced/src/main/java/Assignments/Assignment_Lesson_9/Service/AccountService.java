package Assignments.Assignment_Lesson_9.Service;

import Assignments.Assignment_Lesson_9.DTO.Request.CreateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Request.UpdateAccountRequest;
import Assignments.Assignment_Lesson_9.DTO.Response.AccountResponse;
import Assignments.Assignment_Lesson_9.Entity.Account;
import Assignments.Assignment_Lesson_9.Entity.Department;
import Assignments.Assignment_Lesson_9.Repository.AccountRepository;
import Assignments.Assignment_Lesson_9.Repository.DepartmentRepository;
import Assignments.Assignment_Lesson_9.Validation.AccountValidationRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final AccountRepository accountRepository;
    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;
    private final MessageSource messageSource;

    @Transactional
    @Override
    public void create(CreateAccountRequest createAccountRequest, Locale locale) {
        if (accountRepository.existsByEmail(createAccountRequest.getEmail())) {
            throw new RuntimeException(messageSource.getMessage("email.existed", null, locale));
        }
        if (accountRepository.existsByUsername(createAccountRequest.getUsername())) {
            throw new RuntimeException(messageSource.getMessage("username.existed", null, locale));
        }
        if (createAccountRequest.getCreateDate() != null && createAccountRequest.getCreateDate().isAfter(LocalDate.now())) {
            throw new RuntimeException(messageSource.getMessage("createDate.invalid", null, locale));
        }

        Department department = departmentRepository.findByName(createAccountRequest.getDepartmentName());
        if (department == null) {
            department = new Department();
            department.setName(createAccountRequest.getDepartmentName());
            departmentRepository.save(department);
        }

        Account account = new Account();
        account.setEmail(createAccountRequest.getEmail());
        account.setUsername(createAccountRequest.getUsername());
        account.setFirstName(createAccountRequest.getFirstName());
        account.setLastName(createAccountRequest.getLastName());
        account.setDepartment(department);
        account.setCreateDate(createAccountRequest.getCreateDate() != null ? createAccountRequest.getCreateDate() : LocalDate.now());
        accountRepository.save(account);
    }

    @Override
    public Page<AccountResponse> getAll(AccountValidationRequest accountValidationRequest) {
        Pageable pageable = PageRequest.of(
                accountValidationRequest.getPageNumber() - 1,
                accountValidationRequest.getPageSize(),
                Sort.by(accountValidationRequest.getSortBy())
        );
        Specification<Account> specification = (root, query, criteriaBuilder) -> null;

        if (accountValidationRequest.getSearch() != null && !accountValidationRequest.getSearch().isBlank()) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.or(
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("email")), "%" + accountValidationRequest.getSearch().toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("username")), "%" + accountValidationRequest.getSearch().toLowerCase() + "%"),
                    criteriaBuilder.like(criteriaBuilder.lower(root.join("department").get("name")), "%" + accountValidationRequest.getSearch() + "%")
            ));
        }

        if (accountValidationRequest.getMinCreateDate() != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.greaterThanOrEqualTo(root.get("createDate"), accountValidationRequest.getMinCreateDate())
            );
        }

        if (accountValidationRequest.getMaxCreateDate() != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.lessThanOrEqualTo(root.get("createDate"), accountValidationRequest.getMaxCreateDate())
            );
        }

        return accountRepository.findAll(specification, pageable).map(a -> modelMapper.map(a, AccountResponse.class));
    }

    @Transactional
    @Override
    public void update(UpdateAccountRequest updateAccountRequest, Locale locale) {
        Account account = accountRepository.findById(updateAccountRequest.getId()).orElseThrow(() -> new RuntimeException(messageSource.getMessage("account.notfound", null, locale)));
        if (updateAccountRequest.getEmail() != null) {
            if (accountRepository.existsByEmail(updateAccountRequest.getEmail()) && account.getEmail().equals(updateAccountRequest.getEmail())) {
                throw new RuntimeException(messageSource.getMessage("email.existed", null, locale));
            }
            account.setEmail(updateAccountRequest.getEmail());
        }

        if (updateAccountRequest.getUsername() != null) {
            if (accountRepository.existsByUsername(updateAccountRequest.getUsername()) && account.getUsername().equals(updateAccountRequest.getUsername())) {
                throw new RuntimeException("{username.existed}");
            }
            account.setUsername(updateAccountRequest.getUsername());
        }

        if (updateAccountRequest.getDepartmentName() != null) {
            Department department = departmentRepository.findByName(updateAccountRequest.getDepartmentName());
            if (department == null) {
                Department department1 = new Department();
                department1.setName(updateAccountRequest.getDepartmentName());
                departmentRepository.save(department1);
                account.setDepartment(department1);
            }
            else {
                account.setDepartment(department);
            }
        }
    }

    @Override
    public void delete(Integer id, Locale locale) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException(messageSource.getMessage("account.notfound", null, locale)));
        accountRepository.delete(account);
    }
}
