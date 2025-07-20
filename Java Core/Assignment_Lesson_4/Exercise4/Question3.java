package Exercise4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String inputName = scanner.next();
        String [] words = inputName.split("");
        words[0] = words[0].toUpperCase();
        String userName = String.join("", words);
        System.out.println("Your name is: " + userName);
        scanner.close();
    }
}
