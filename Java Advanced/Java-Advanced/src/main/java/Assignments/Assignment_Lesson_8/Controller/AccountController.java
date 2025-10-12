package Assignments.Assignment_Lesson_8.Controller;

import Assignments.Assignment_Lesson_8.DTO.Response.AccountResponse;
import Assignments.Assignment_Lesson_8.Service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final IAccountService accountService;

    @GetMapping
    public List<AccountResponse> getAllAccounts(
            @RequestParam(required = false) String username,
            @RequestParam(required = false) String departmentName
    ) {
        return accountService.getAllAccounts(username, departmentName);
    }
}
