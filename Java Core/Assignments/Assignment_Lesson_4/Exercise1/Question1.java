package Assignments.Assignment_Lesson_4.Exercise1;

public class Question1 {
    public static void main(String[] args) {
        float salaryAcc1 = 5240.5f;
        float salaryAcc2 = 10970.055f;

        int rounded1 = Math.round(salaryAcc1);
        int rounded2 = Math.round(salaryAcc2);

        System.out.println("Salary of Account 1: " + rounded1 + " $");
        System.out.println("Salary of Account 2: " + rounded2 + " $");
    }
}
