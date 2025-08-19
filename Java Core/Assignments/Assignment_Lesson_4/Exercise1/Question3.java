package Assignments.Assignment_Lesson_4.Exercise1;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100000);
        String formater = String.format("%05d", number);
        String last2Digits = formater.substring(3);
        System.out.println("Last 2 Digits of Random Number: " + last2Digits);
    }
}
