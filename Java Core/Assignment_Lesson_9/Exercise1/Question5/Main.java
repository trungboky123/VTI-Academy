package Assignment_Lesson_9.Exercise1.Question5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Hien"));
        students.add(new Student("An"));
        students.add(new Student("Huong"));
        students.add(new Student("Hieu"));

        Set<String> names = new TreeSet<>();
        for (Student s : students) {
            names.add(s.name);
        }
        System.out.println(names);
    }
}
