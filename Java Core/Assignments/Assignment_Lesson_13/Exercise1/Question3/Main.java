package Assignments.Assignment_Lesson_13.Exercise1.Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the position you want to add: ");
            String inputPosition = scanner.nextLine();
            int result = AddPosition.addPosition(inputPosition);
            if(result > 0){
                System.out.println("Added successfully!");
            }
            else{
                System.out.println("Failed to add!");
            }
            scanner.close();
        } catch (Exception e){
            throw new Exception("Error: " + e.getMessage());
        }
    }
}
