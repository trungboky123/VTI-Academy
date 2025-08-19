package Assignments.Assignment_Lesson_7.Exercise3.Question3;

public class Program {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Minimum of this array is " + numbers.length + " elements");
        }
    }
}
