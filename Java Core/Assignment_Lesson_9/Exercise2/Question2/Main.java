package Assignment_Lesson_9.Exercise2.Question2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "An", LocalDate.of(2000, 5, 20), 8.5));
        students.add(new Student(2, "An", LocalDate.of(2000, 5, 20), 7.5));
        students.add(new Student(3, "Binh", LocalDate.of(1999, 7, 15), 9.0));
        students.add(new Student(4, "An", LocalDate.of(2001, 1, 1), 8.0));
        students.add(new Student(5, "Cuong", LocalDate.of(2000, 3, 10), 6.5));

        students.sort(null);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
