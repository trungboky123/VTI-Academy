package Exercise3.Question8;

import java.util.Scanner;

public class DoubleValue {
    public static double inputDouble(String errorMessage){
        while (true) {
            try {
                System.out.println("Enter a double value: ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                double doubleValue = Double.parseDouble(input);
                return doubleValue;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + errorMessage);
            }
        }
    }
}
