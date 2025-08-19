package Assignments.Assignment_Lesson_7.Exercise3.Question8;

import java.util.Scanner;

public class StringValue {
    public static String inputString(){
        System.out.println("Enter a string value: ");
        Scanner scanner = new Scanner(System.in);
        String stringValue = scanner.nextLine();
        return stringValue;
    }
}
