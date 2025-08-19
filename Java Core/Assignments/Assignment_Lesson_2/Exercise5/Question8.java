package Assignments.Assignment_Lesson_2.Exercise5;

import java.util.Scanner;

public class Question8 {
    public static Account1 createAccount(){
        Scanner scanner = new Scanner(System.in);
        Account1 account = new Account1();
        Position1 position = new Position1();

        System.out.println("Enter ID: ");
        account.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter email: ");
        account.email = scanner.nextLine();

        System.out.println("Enter full name: ");
        account.fullName = scanner.nextLine();

        System.out.println("Enter position (choose from 1 to 4): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                position.name = PositionEnum1.Dev;
                break;
            case 2:
                position.name = PositionEnum1.Test;
                break;
            case 3:
                position.name = PositionEnum1.Scrum_Master;
                break;
            case 4:
                position.name = PositionEnum1.PM;
                break;
            default:
                System.out.println("Invalid choice.");
                return null;
        }
        account.position = position;
        return account;
    }

    public static Department1 createDepartment(){
        Scanner scanner = new Scanner(System.in);
        Department1 department = new Department1();

        System.out.println("Enter Department ID: ");
        department.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Department Name: ");
        department.name = scanner.nextLine();

        return department;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        System.out.println("1 for creating new account");
        System.out.println("2 for creating new department");
        int choice = scanner.nextInt();
        if(choice == 1){
            Account1 acc = createAccount();
            System.out.println("Creating account successfully!");
            System.out.println("Account ID: " + acc.id);
            System.out.println("Email: " + acc.email);
            System.out.println("Full Name: " + acc.fullName);
            System.out.println("Position: " + acc.position.name);
        }
        else if(choice == 2){
            Department1 dept = createDepartment();
            System.out.println("Creating department successfully!");
            System.out.println("Department ID: " + dept.id);
            System.out.println("Department Name: " + dept.name);
        }
        else{
            System.out.println("Invalid choice! Please enter again");
        }
    }
}
