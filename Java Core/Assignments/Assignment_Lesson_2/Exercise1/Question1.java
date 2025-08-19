package Assignments.Assignment_Lesson_2.Exercise1;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;

public class Question1 {
    public static void main(String[] args){
        Department d2 = new Department(2, "Marketting");
        Position p2 = new Position(2, PositionEnum.Test);
        Account a2 = new Account(2, "jane@example.com", "jane", "Jane Smith", d2, p2, LocalDate.now());

        if(a2.department == null){
            System.out.println("This account hasn't got a department");
        }
        else {
            System.out.println("The department of this account is " + a2.department.name);
        }
    }
}
