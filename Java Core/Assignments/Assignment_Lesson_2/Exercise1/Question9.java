package Assignments.Assignment_Lesson_2.Exercise1;

import Assignments.Assignment_Lesson_1.Question1.*;

public class Question9 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");
        Department d3 = new Department(3, "IT");

        Department[] departments = {d1, d2, d3};

        for (Department d : departments){
            System.out.println("Department ID: " + d.id);
            System.out.println("Department Name: " + d.name);
        }
    }
}
