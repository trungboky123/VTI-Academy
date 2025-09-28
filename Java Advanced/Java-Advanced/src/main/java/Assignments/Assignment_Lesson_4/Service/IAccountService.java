package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Account;

import java.util.List;

public interface IAccountService {
    void create(Account account);
    List<Account> getAccountsHavingHighestSalary();
}
