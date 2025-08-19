package Assignments.Assignment_Lesson_7.Exercise3.Question9;

import java.util.Scanner;

public class ScannerUtils {
    public int inputInt(){
        while(true){
            try {
                System.out.println("Enter id: ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                int intValue = Integer.parseInt(input);
                return intValue;
            } catch (NumberFormatException e) {
                throw new RuntimeException("Please enter an integer value!");
            }
        }
    }

    public String inputString(){
        while(true){
            System.out.println("Enter name: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            return input;
        }
    }
}
