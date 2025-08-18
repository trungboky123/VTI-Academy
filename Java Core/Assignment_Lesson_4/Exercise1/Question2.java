package Exercise1;

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100000);
        String formater = String.format("%05d", number);
        System.out.println("Random number: " + formater);
    }
}
