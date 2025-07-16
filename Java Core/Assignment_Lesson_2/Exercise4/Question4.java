package Exercise4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate startDate = LocalDate.of(1975, 7, 24);
        LocalDate endDate = LocalDate.of(1975, 12, 20);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

        Random random = new Random();
        long randomDay = random.nextInt((int) daysBetween + 1);

        LocalDate randomDate = startDate.plusDays(randomDay);

        System.out.println(randomDate.format(formatter));
    }
}
