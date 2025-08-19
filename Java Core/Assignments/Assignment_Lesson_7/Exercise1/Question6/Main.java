package Assignments.Assignment_Lesson_7.Exercise1.Question6;

public class Main {
    public static void main(String[] args) {
        new PrimaryStudent();
        new PrimaryStudent();
        new SecondaryStudent();
        new SecondaryStudent();
        new SecondaryStudent();
        new SecondaryStudent();

        System.out.println("Number of students: " + Student.count);
        System.out.println("Number of primary students: " + PrimaryStudent.primaryCount);
        System.out.println("Number of secondary students: " + SecondaryStudent.secondaryCount);
    }
}
