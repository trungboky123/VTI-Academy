package Exercise4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        String nameNoSpace = userName.replace(" ", "");
        for(int i = 0; i < nameNoSpace.length(); i++){
            System.out.println("Character " + (i + 1) + ": " + nameNoSpace.charAt(i));
        }
        scanner.close();
    }  
}

