package Assignments.Assignment_Lesson_4.Mapper;

import Assignments.Assignment_Lesson_4.Entity.Account;
import Assignments.Assignment_Lesson_4.Entity.Department;
import java.math.BigDecimal;

public class AccountMapper {
    public static Account createAccount(String email, String fullName, Department department, BigDecimal salary) {
        Account account = new Account();
        account.setEmail(email);
        account.setFullName(fullName);
        account.setDepartment(department);
        account.setSalary(salary);
        return account;
    }
}
