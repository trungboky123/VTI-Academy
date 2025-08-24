package Assignments.Assignment_Lesson_13.Exercise2.Question3;

import Assignments.Assignment_Lesson_1.Question1.Department;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter department id: ");
            int id = scanner.nextInt();
            Department department = GetDepartmentById.getDepartmentById(id);
            if(department == null){
                System.out.println("Cannot find department with id = " + id);
            }
            else{
                System.out.println("Department ID: " + department.id);
                System.out.println("Department Name: " + department.name);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
