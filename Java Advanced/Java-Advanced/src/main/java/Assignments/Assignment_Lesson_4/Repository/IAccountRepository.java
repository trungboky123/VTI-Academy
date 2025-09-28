package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Account;
import java.util.List;

public interface IAccountRepository {
    void create(Account account);
    List<Account> getAccountsHavingHighestSalary();
}
