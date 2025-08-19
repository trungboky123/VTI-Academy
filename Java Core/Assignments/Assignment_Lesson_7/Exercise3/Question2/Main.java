package Assignments.Assignment_Lesson_7.Exercise3.Question2;

public class Main {
    public static void main(String[] args) {
        try {
            float result = Program.divide(7, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Cannot divide 0");
        } finally {
            System.out.println("Divide completed!");
        }
    }
}
