package Assignments.Assignment_Lesson_4.Exercise4;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String userFirstName = scanner.nextLine();
        System.out.println("Enter your last name(s): ");
        String userLastNames = scanner.nextLine();
        String fullName = userFirstName + " " + userLastNames;
        System.out.println("Your full name is: " + fullName);
        scanner.close();
    }
}
