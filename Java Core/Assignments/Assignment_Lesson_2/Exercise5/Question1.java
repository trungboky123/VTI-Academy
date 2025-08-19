package Assignments.Assignment_Lesson_2.Exercise5;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("You have entered " + x + ", " + y + " and " + z);
        scanner.close();
    }
}
