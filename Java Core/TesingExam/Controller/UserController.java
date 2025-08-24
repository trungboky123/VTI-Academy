package TesingExam.Controller;

import TesingExam.Service.UserService;
import java.util.Scanner;

// Welcome to my login service. Only admin can register their account. Admin can also create employee account. If you are not admin, you can not register account.
// Valid password: 6-12 letters
// Valid email : have @gmail.com
// Valid full name: not contain any numbers
public class UserController {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            UserService userService = new UserService();
            if (choice == 1) {
                System.out.println("===Login===");
                System.out.println("Enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Enter your password: ");
                String password = scanner.nextLine();
                if (!userService.login(email, password)) {
                    throw new Exception("Wrong email or password!");
                } else {
                    System.out.println("Login successfully!");
                    String userRole = userService.detectRoleByEmail(email);
                    if (userRole.equals("Employee")) {
                        System.out.println("Welcome! You are an employee!");
                    } else {
                        System.out.println("Welcome! You are an admin!");
                        System.out.println("Do you want to create any employee account?");
                        System.out.println("1. Yes");
                        System.out.println("2. No");
                        int adminChoice = Integer.parseInt(scanner.nextLine());
                        switch (adminChoice) {
                            case 1:
                                try {
                                    System.out.println("Enter employee's full name: ");
                                    String emFullName = scanner.nextLine();
                                    System.out.println("Enter employee's email: ");
                                    String emEmail = scanner.nextLine();
                                    System.out.println("Password will be set to 123456 by default");
                                    System.out.println("Enter employee's pro skill: ");
                                    String emProSkill = scanner.nextLine();
                                    userService.createEmployee(emFullName, emEmail, emProSkill);
                                    System.out.println("Create employee successfully!");
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Cannot create employee, " + e.getMessage());
                                    break;
                                }
                            case 2:
                                break;
                        }
                    }
                }
            } else {
                System.out.println("Enter 'admin' to confirm you are admin: ");
                String pass = scanner.nextLine().toLowerCase();
                if (pass.equals("admin")) {
                    System.out.println("Enter your full name: ");
                    String adminName = scanner.nextLine();
                    System.out.println("Enter your email: ");
                    String adminEmail = scanner.nextLine();
                    System.out.println("Enter your password: ");
                    String adminPassword = scanner.nextLine();
                    System.out.println("Enter your years of experience (You can skip if don't have)");
                    int adminYearExp = Integer.parseInt(scanner.nextLine());
                    userService.createAdmin(adminName, adminEmail, adminPassword, adminYearExp);
                    System.out.println("Created successfully!");
                } else {
                    System.out.println("Wrong passkey, you are not an admin!");
                }
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
