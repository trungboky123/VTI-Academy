package Exercise5;

import java.util.Scanner;

public class Question5 {
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
    public static void main(String[] args) {
        Account1 newAcc = createAccount();
        
        System.out.println("ID: " + newAcc.id);
        System.out.println("Email: " + newAcc.email);
        System.out.println("Full name: " + newAcc.fullName);
        System.out.println("Position: " + newAcc.position.name);
    }
}
