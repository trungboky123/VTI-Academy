package Assignments.Assignment_Lesson_7.Exercise3.Question8;

import java.util.Scanner;

public class FloatValue {
    public static float inputFloat(String errorMessage){
        while (true) {
            try {
                System.out.println("Enter a float value: ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                float floatValue = Float.parseFloat(input);
                return floatValue;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + errorMessage);
            }
        }
    }
}
