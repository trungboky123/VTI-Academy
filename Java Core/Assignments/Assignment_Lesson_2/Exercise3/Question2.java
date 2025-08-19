package Assignments.Assignment_Lesson_2.Exercise3;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Question2 {
    public static void main(String[] args) {
        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");

        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, 1, LocalDate.now());

        Locale locale = new Locale("vi", "VN");
        LocalDateTime fullDateTime = LocalDateTime.of(e1.createDate, LocalTime.now());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", locale);

        System.out.println("Exam ID: " + e1.id);
        System.out.println("Title: " + e1.title);
        System.out.println("Create Time: " + fullDateTime.format(formatter));
    }
}
