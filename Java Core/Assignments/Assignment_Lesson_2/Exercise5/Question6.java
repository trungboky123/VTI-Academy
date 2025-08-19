package Assignments.Assignment_Lesson_2.Exercise5;

import java.util.Scanner;

public class Question6 {
    public static Department1 createDepartment(){
        Scanner scanner = new Scanner(System.in);
        Department1 department = new Department1();

        System.out.println("Enter Department ID: ");
        department.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Department Name: ");
        department.name = scanner.nextLine();

        return department;
    }
    public static void main(String[] args) {
        Department1 newDept = createDepartment();

        System.out.println("Department ID: " + newDept.id);
        System.out.println("Department Name: " + newDept.name);
    }
}
