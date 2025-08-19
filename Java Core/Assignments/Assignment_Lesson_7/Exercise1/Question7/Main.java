package Assignments.Assignment_Lesson_7.Exercise1.Question7;

public class Main {
    public static void main(String[] args) {
        try {
            new Student();
            new Student();
            new Student();
            new Student();
            new Student();
            new Student();
            new Student();
            new Student();
            System.out.println(Student.count);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
