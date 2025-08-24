package Assignments.Assignment_Lesson_13.Exercise2.Question7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the department id you want to delete: ");
            int id = scanner.nextInt();
            DeleteDepartment.deleteDepartment(id);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
