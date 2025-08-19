package Assignments.Assignment_Lesson_4.Exercise4;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        int wordCount;
        if(inputString.isEmpty()){
            wordCount = 0;
        }
        else{
            String [] words = inputString.trim().split("\\s+");
            wordCount = words.length;
        }
        System.out.println("Word Count: " + wordCount);
        scanner.close();
    }
}
