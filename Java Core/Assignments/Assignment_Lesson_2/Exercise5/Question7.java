package Assignments.Assignment_Lesson_2.Exercise5;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter an even number: ");
            n = scanner.nextInt();
        } while (n % 2 != 0);
        System.out.println("You have entered an even number!");
        scanner.close();
    }
}
