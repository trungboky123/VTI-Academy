package Assignments.Assignment_Lesson_7.Exercise3.Question6;

import java.util.Scanner;

public class Age {
    public static int inputAge() {
        Scanner scanner = new Scanner(System.in);
        int age;
        while (true) {
            System.out.println("Enter your age: ");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if (age < 0) {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong inputting! Please input an age as int, input again.");
            }
        }
    }
}
