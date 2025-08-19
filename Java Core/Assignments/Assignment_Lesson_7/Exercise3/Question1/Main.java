package Assignments.Assignment_Lesson_7.Exercise3.Question1;

public class Main {
    public static void main(String[] args) {
        try {
            float result = Program.divide(7, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide 0");
        }
    }
}
