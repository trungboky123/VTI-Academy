package Assignment_Lesson_9.Exercise1.Question4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Hien"));
        students.add(new Student("Huong"));
        students.add(new Student("Hieu"));
        students.add(new Student("Han"));

        System.out.println(students);
    }
}
