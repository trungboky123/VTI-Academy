package Assignments.Assignment_Lesson_2.Exercise3;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question5 {
    public static void main(String[] args) {
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");

        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, 1, LocalDate.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");

        System.out.println("Exam id: " + e1.id);
        System.out.println("Exam Title: " + e1.title);
        System.out.println("Create Month and Day: " + e1.createDate.format(formatter));
    }
}
