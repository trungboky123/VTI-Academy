package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Entity.Account;
import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Mapper.AccountMapper;
import Assignments.Assignment_Lesson_4.Service.AccountService;
import Assignments.Assignment_Lesson_4.Service.IAccountService;
import Assignments.Assignment_Lesson_4.Validation.EmailValidation;
import java.math.BigDecimal;
import java.util.Scanner;

public class CreateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IAccountService accountService = new AccountService();
        String email;
        do {
            System.out.println("Enter email: ");
            email = scanner.nextLine();
            if (!EmailValidation.isValid(email)) {
                System.out.println("Invalid email! Please enter again: ");
            }
        } while (!EmailValidation.isValid(email));
        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter salary: ");
        BigDecimal salary = scanner.nextBigDecimal();
        scanner.nextLine();
        Department department;
        Account account;
        do {
            System.out.println("Enter department name you want to join: ");
            String name = scanner.nextLine();
            department = GetDepartmentByName.get(name);
            if (department == null) {
                System.out.println("Department not found. Please enter again!");
                continue;
            }
            if (department.getAccounts().size() >= 100) {
                System.out.println("Department is full. Please enter another department name!");
                continue;
            }
            account = AccountMapper.createAccount(email, fullName, department, salary);
            department.getAccounts().add(account);
            break;
        } while (true);
        accountService.create(account);
    }
}
