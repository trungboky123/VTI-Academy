package Assignments.Assignment_Lesson_13.Exercise2.Question2;

import Assignments.Assignment_Lesson_1.Question1.Department;

public class Main {
    public static void main(String[] args) {
        try{
            Department department = GetDepartmentById.getDepartmentById(5);
            if(department == null){
                System.out.println("Cannot find department with id = 5");
            }
            else{
                System.out.println("Department ID: " + department.id);
                System.out.println("Department Name: " + department.name);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
