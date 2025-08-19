package Assignments.Assignment_Lesson_2.Exercise5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter your birthday: ");
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(inputDate, formatter);
        System.out.println("Your birthday is: " + birthday.format(formatter));
        scanner.close();
    }
}
