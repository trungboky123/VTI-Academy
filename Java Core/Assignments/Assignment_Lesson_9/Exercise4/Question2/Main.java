package Assignments.Assignment_Lesson_9.Exercise4.Question2;

public class Main {
    public static void main(String[] args) {
        MyNumber<Integer> n1 = new MyNumber<>(1);
        MyNumber<Double> n2 = new MyNumber<>(2.5);

        System.out.println("Integer Number: " + n1.number);
        System.out.println("Double Number: " + n2.number);
    }
}
