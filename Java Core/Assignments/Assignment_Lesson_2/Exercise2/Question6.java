package Assignments.Assignment_Lesson_2.Exercise2;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;

public class Question6 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");
        Department d3 = new Department(3, "IT");

        Position p1 = new Position(1, PositionEnum.Dev);
        Position p2 = new Position(2, PositionEnum.Test);
        Position p3 = new Position(3, PositionEnum.PM);

        Account a1 = new Account(1, "john@example.com", "john", "John Doe", d1, p1, LocalDate.now());
        Account a2 = new Account(2, "jane@example.com", "jane", "Jane Smith", d2, p2, LocalDate.now());
        Account a3 = new Account(3, "bob@example.com", "bob", "Bob Lee", d3, p3, LocalDate.now());

        Account[] accounts = {a1, a2, a3};

        System.out.printf("%-25s | %-20s | %-15s\n", "Email", "Full Name", "Department");
        System.out.println("-------------------------------------------------------------------");

        for (Account a : accounts) {
            System.out.printf("%-25s | %-20s | %-15s\n", a.email, a.fullName,a.department.name);
        }
    }
}
