package Assignment_Lesson_7.Exercise1.Question4;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyen Van A");
        Student s2 = new Student(2, "Nguyen Van B");
        Student s3 = new Student(3, "Nguyen Van C");

        Student.college = "Hanoi University of Science and Technology";

        System.out.println("Before changing university");
        System.out.println(Student.getCollege());

        System.out.println("After changing university");
        Student.setCollege("University of Engineering and Technology");
        System.out.println(Student.getCollege());
    }
}
