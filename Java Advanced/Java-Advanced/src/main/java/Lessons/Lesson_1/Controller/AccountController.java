package Lessons.Lesson_1.Controller;

import Lessons.Lesson_1.Entity.Account;
import Lessons.Lesson_1.Service.AccountDao;
import Lessons.Lesson_1.Service.AccountImpl;

import java.time.LocalDateTime;

public class AccountController {
    public static void main(String[] args) {
        Account account = new Account();
        account.setUsername("Username");
        account.setEmail("Username@gmail.com");
        account.setFullName("Full Name");
        account.setDepartmentId(1);
        account.setPositionId(1);
        account.setCreateDate(LocalDateTime.now());
        AccountDao accountDao = new AccountImpl();
        accountDao.save(account);
    }
}
