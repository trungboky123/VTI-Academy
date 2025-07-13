package Exercise2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question5 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formatted = now.format(formatter);
        System.out.println(formatted);
    }
}
