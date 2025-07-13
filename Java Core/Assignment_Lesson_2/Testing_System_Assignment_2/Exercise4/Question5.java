package Exercise4;

import java.time.LocalDate;
import java.util.Random;

public class Question5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Random random = new Random();
        int randomDay = random.nextInt(366);

        LocalDate randomDate = now.minusDays(randomDay);

        System.out.println(randomDate);
    }
}
