package Exercise4;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String inputName = scanner.nextLine();
        String [] wordsName = inputName.split("\\s+");
        for(int i = 0; i < wordsName.length; i++){
            wordsName[i] = wordsName[i].substring(0, 1).toUpperCase() + wordsName[i].substring(1).toLowerCase();
        }
        String capitalized = String.join(" ", wordsName);
        System.out.println("Your name is: " + capitalized);
        scanner.close();
    }
}
