package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Entity.Account;
import Assignments.Assignment_Lesson_4.Service.AccountService;
import Assignments.Assignment_Lesson_4.Service.IAccountService;
import java.util.List;

public class GetAccountsHavingHighestSalary {
    public static void main(String[] args) {
        IAccountService accountService = new AccountService();
        List<Account> accounts = accountService.getAccountsHavingHighestSalary();
        for (Account acc : accounts) {
            System.out.println("Name: " + acc.getFullName() + ", Salary: " + acc.getSalary());
        }
    }
}
