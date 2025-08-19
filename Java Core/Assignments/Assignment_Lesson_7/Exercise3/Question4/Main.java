package Assignments.Assignment_Lesson_7.Exercise3.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "IT");
        Department d3 = new Department(3, "Marketting");

        Department[] departments = {d1, d2, d3};

        try {
            System.out.println("You want to see information of which element?: ");
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();
            System.out.println(departments[index]);
            scanner.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department!");
        }
    }
}
