package Assignments.Assignment_Lesson_13.Exercise2.Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter department id you want to update: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter new department name: ");
            String newName = scanner.nextLine();
            UpdateDepartment.updateDepartmentName(id, newName);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
