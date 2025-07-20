package Exercise4;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.next();
        if(inputString == null || inputString.matches(".*\\d.*")){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
        scanner.close();
    }
}
