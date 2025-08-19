package Assignments.Assignment_Lesson_2.Exercise5;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Your name is: " + inputString);
        scanner.close();
    }
}
