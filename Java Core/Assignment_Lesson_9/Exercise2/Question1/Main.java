package Exercise2.Question1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Hien", LocalDate.of(2005, 4, 6), 9));
        students.add(new Student(2, "Huong", LocalDate.of(2004, 11, 5), 8.5));
        students.add(new Student(3, "Hieu", LocalDate.of(2012, 3, 5), 7));
        students.add(new Student(4, "Thang", LocalDate.of(1976, 7, 23), 7.5));
        students.add(new Student(5, "Thuy", LocalDate.of(1976, 6, 22), 8));
        
        students.sort(null);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
