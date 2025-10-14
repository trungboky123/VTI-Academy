package Assignments.Assignment_Lesson_8.Service;

import Assignments.Assignment_Lesson_8.DTO.Response.AccountResponse;
import Assignments.Assignment_Lesson_8.Entity.Account;
import Assignments.Assignment_Lesson_8.Repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountService implements IAccountService {
    private final ModelMapper modelMapper;
    private final AccountRepository accountRepository;

    @Override
    public List<AccountResponse> getAllAccounts(String username, String departmentName) {
        Specification<Account> specification = (root, query, criteriaBuilder) -> null;

        if (username != null && !username.isBlank()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("username")), "%" + username.toLowerCase() + "%"));
        }

        if (departmentName != null && !departmentName.isBlank()) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.like(criteriaBuilder.lower(root.join("department").get("name")), "%" + departmentName.toLowerCase() + "%"));
        }

        return accountRepository.findAll(specification).stream().map(a -> modelMapper.map(a, AccountResponse.class)).toList();
    }
}
