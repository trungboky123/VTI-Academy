package Assignments.Assignment_Lesson_7.Exercise1.Question2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyen Van A");
        Student s2 = new Student(2, "Nguyen Van B");
        Student s3 = new Student(3, "Nguyen Van C");

        Student[] students = {s1, s2, s3};
        System.out.println("Every student deposit 100k");
        for (Student s : students) {
            Student.moneyGroup += 100;
        }
        System.out.println("Class fund: " + Student.moneyGroup + "k");

        System.out.println("Nguyen Van A takes 50k to buy snacks");
        Student.moneyGroup -= 50;
        System.out.println("Class fund: " + Student.moneyGroup + "k");

        System.out.println("Nguyen Van B takes 20k to buy bread");
        Student.moneyGroup -= 20;
        System.out.println("Class fund: " + Student.moneyGroup + "k");

        System.out.println("Nguyen Van C takes 150k to buy school supplies");
        Student.moneyGroup -= 150;
        System.out.println("Class fund: " + Student.moneyGroup + "k");

        System.out.println("Every student deposit 50k");
        for (Student s : students) {
            Student.moneyGroup += 50;
        }
        System.out.println("Class fund: " + Student.moneyGroup + "k");
    }
}
