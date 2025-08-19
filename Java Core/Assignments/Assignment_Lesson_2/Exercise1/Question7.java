package Assignments.Assignment_Lesson_2.Exercise1;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;

public class Question7 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");

        Position p1 = new Position(1, PositionEnum.Dev);

        Account a1 = new Account(1, "john@example.com", "john", "John Doe", d1, p1, LocalDate.now());

        switch (a1.position.name) {
            case PositionEnum.Dev:
                System.out.println("This is a developer");
                break;
            default:
                System.out.println("This isn't a developer");
                break;
        }
    }
}
