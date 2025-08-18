package Exercise3.Question7;

import java.util.Scanner;

public class ScannerUtils {
    public static int inputInt(String errorMessage){
        while(true){
            try {
                System.out.println("Enter your id: ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                int intValue = Integer.parseInt(input);
                return intValue;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + errorMessage);
            }
        }
    } 
}
