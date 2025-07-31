package Assignment_Lesson_7.Exercise1.Question7;

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();
            Student s4 = new Student();
            Student s5 = new Student();
            Student s6 = new Student();
            Student s7 = new Student();
            Student s8 = new Student();
            System.out.println(Student.count);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
