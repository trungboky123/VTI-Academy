package Assignments.Assignment_Lesson_8.Service;

import Assignments.Assignment_Lesson_8.DTO.Response.AccountResponse;

import java.util.List;

public interface IAccountService {
    List<AccountResponse> getAllAccounts(String username, String departmentName);
}
