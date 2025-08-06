package Assignment_Lesson_9.Exercise1.Question1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hien"));
        students.add(new Student("Duong"));
        students.add(new Student("Binh"));
        students.add(new Student("Binh"));
        students.add(new Student("Huong"));
        students.add(new Student("Binh"));

        // a) Print out the total number of elements of students
        System.out.println("Total number of students: " + students.size());

        // b) Take the fourth element of students
        System.out.println("The fourth element of students: " + students.get(3));

        // c) Print out first element and last element of students
        System.out.println("First element: " + students.get(0) + "; Last element: " + students.get(students.size() - 1));

        // d) Add one student to the top of students
        students.add(0, new Student("Cuong"));
        System.out.println("Added new student to the top of students: " + students.get(0));

        // e) Add one student to the last of students
        students.add(new Student("Lan"));
        System.out.println("Added new student to the last of students: " + students.get(students.size() - 1));

        // f) Reverse the students
        System.out.println("Reversed students: " + students.reversed());

        // g) Create one method to search student by id (see in file StudentMethods.java for details)
        StudentMethods.searchById(students, 5);

        // h) Create one method to search student by name (see in file StudentMethods.java for details)
        StudentMethods.searchByName(students, "Binh");

        // i) Create one method to search students having same name (see in file StudentMethods.java for details)
        List<Student> duplicateNames = StudentMethods.findDuplicateNames(students);
        for(Student s : duplicateNames){
            System.out.println(s);
        }

        // i) Delete student name whose id = 2 (see in file StudentMethods.java for details)
        StudentMethods.removeStudentNameByID(students);
        System.out.println(students);

        // k) Delete student having id = 5 (see in file StudentMethods.java for details)
        StudentMethods.removeStudentByID(students);
        System.out.println(students);

        // l) Create an ArrayList named studentCopies and add all students to studentCopies
        List<Student> students1 = new ArrayList<>();
        students1.addAll(students);
        System.out.println(students1);
    }
}
