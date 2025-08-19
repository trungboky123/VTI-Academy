package Assignments.Assignment_Lesson_2.Exercise4;

import java.time.LocalDate;
import java.util.Random;

public class Question6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Random random = new Random();
        int randomDay = random.nextInt(10000) + 1;

        LocalDate randomDate = now.minusDays(randomDay);

        System.out.println(randomDate);
    }
}
