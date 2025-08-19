package Assignments.Assignment_Lesson_2.Exercise3;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;

public class Question3 {
    public static void main(String[] args) {
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");

        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, 1, LocalDate.now());

        System.out.println("Exam id: " + e1.id);
        System.out.println("Exam Title: " + e1.title);
        System.out.println("Create Year: " + e1.createDate.getYear());
    }
}
