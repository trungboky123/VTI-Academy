package Assignments.Assignment_Lesson_13.Exercise2.Question5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter department name you want to add: ");
            String name = scanner.nextLine();
            CreateDepartment.createDepartment(name);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
