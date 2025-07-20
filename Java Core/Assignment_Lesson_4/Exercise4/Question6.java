package Exercise4;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();
        String [] arrName = fullName.trim().split("\\s+");
        String firstName = arrName[0];
        String lastName = arrName[arrName.length - 1];
        String middleNames = "";
        for(int i = 1; i < arrName.length - 1; i++){
            middleNames += arrName[i] + " ";
        }
        System.out.println("Your first name: " + firstName);
        System.out.println("Your middle name(s): " + middleNames);
        System.out.println("Your last name: " + lastName);
        scanner.close();
    }
}
