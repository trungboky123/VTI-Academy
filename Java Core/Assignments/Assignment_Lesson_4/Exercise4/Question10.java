package Assignments.Assignment_Lesson_4.Exercise4;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Enter another string: ");
        String reversed = scanner.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        if(reversed.equals(reversedInput)){
            System.out.println(input + " is a reversed string of " + reversed);
        }
        else{
            System.out.println(input + " is not a reversed string of " + reversed);
        }
        scanner.close();
    }
}
