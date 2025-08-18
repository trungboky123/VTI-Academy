package Exercise1.Question3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("An"));
        students.add(new Student("Binh"));
        students.add(new Student("Chi"));
        students.add(new Student("Huong"));
        students.add(new Student("Huong"));

        // a) Print out the total number of elements of students
        System.out.println("Total number of students: " + students.size());

        // g) Create one method to find students by ids (see in file StudentMethods.java for details)
        Student s = StudentMethods.findStudentByID(students, 3);
        System.out.println(s);

        // h) Create one method to find students by names (see in file StudentMethods.java for details)
        Student s1 = StudentMethods.findStudentByName(students, "Huong");
        System.out.println(s1);

        // i) Create one method to find students having same names(see in file StudentMethods.java for details)
        Set<Student> duplicateNames = StudentMethods.findDuplicateNames(students);
        System.out.println(duplicateNames);

        // j) Delete name of student whose id = 2 (see in file StudentMethods.java for details)
        StudentMethods.deleteNameByID(students);

        // k) Remove student having id = 5 (see in file StudentMethods.java for details)
        StudentMethods.removeStudentByID(students);

        // l) Create an ArrayList named studentCopies and add all students to studentCopies
        List<Student> students1 = new ArrayList<>();
        students1.addAll(students);
        System.out.println(students1);
    }
}
