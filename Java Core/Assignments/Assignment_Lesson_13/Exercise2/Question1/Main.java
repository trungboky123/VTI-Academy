package Assignments.Assignment_Lesson_13.Exercise2.Question1;

import Assignments.Assignment_Lesson_1.Question1.Department;
import java.util.List;

public class Main {
    public static void main(String[] args){
        try{
            List<Department> departments = GetDepartments.getDepartments();
            for(Department d : departments){
                System.out.println("Department ID: " + d.id + ", Department Name: " + d.name);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
