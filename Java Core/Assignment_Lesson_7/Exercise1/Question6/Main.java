package Assignment_Lesson_7.Exercise1.Question6;

public class Main {
    public static void main(String[] args) {
        Student s1 = new PrimaryStudent();
        Student s2 = new PrimaryStudent();
        Student s3 = new SecondaryStudent();
        Student s4 = new SecondaryStudent();
        Student s5 = new SecondaryStudent();
        Student s6 = new SecondaryStudent();

        System.out.println("Number of students: " + Student.count);
        System.out.println("Number of primary students: " + PrimaryStudent.primaryCount);
        System.out.println("Number of secondary students: " + SecondaryStudent.secondaryCount);
    }
}
