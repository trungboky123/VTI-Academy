package Exercise3.Question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student<>(1, "Hien"));
        students.add(new Student<>(1.5f, "Huong"));
        students.add(new Student<>(2.5, "Hieu"));
        System.out.println(students);
    }
}
