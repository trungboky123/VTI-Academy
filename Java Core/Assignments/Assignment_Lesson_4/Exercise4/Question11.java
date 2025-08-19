package Assignments.Assignment_Lesson_4.Exercise4;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("Letter a appears " + count + " time(s)");
        scanner.close();
    }
}
