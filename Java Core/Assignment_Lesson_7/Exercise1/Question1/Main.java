package Assignment_Lesson_7.Exercise1.Question1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyen Van A");
        Student s2 = new Student(2, "Nguyen Van B");
        Student s3 = new Student(3, "Nguyen Van C");

        Student.college = "Hanoi University of Science and Technology";

        Student[] students = {s1, s2, s3};
        System.out.println("----Old university----");
        for (Student s : students) {
            System.out.println(s);
        }

        Student.college = "University of Engineering and Technology";
        System.out.println("----New university----");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
