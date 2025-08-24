package Assignments.Assignment_Lesson_13.Exercise1.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position id you want to delete: ");
        int positionId = scanner.nextInt();
        int result = DeletePositionById.deletePositionById(positionId);
        if(result > 0){
            System.out.println("Deleted successfully!");
        }
        else{
            System.out.println("Cannot find the position with id = " + positionId);
        }
    }
}
