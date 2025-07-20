package Exercise4;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = "";
        for(int i = inputString.length() - 1; i >= 0; i--){
            reversedString += inputString.charAt(i);
        }
        System.out.println("Reversed string: " + reversedString);
        scanner.close();
    }
}
