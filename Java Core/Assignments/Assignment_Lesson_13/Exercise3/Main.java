package Assignments.Assignment_Lesson_13.Exercise3.Question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter department id you want to delete: ");
            int id = scanner.nextInt();
            DeleteDepartmentById.deleteDepartmentById(id);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
