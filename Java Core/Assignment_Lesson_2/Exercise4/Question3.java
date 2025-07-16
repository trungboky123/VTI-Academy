package Exercise4;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        String [] classMates = {"Nguyen Van A", "Nguyen Van B", "Nguyen Van C"};
        Random random = new Random();

        int index = random.nextInt(classMates.length);

        System.out.println(classMates[index]);
    }
}
