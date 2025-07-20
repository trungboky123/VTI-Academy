package Exercise4;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        inputString = inputString.replace(" ", "");
        System.out.println("Enter a positive number: ");
        int n = scanner.nextInt();
        if(inputString.length() % n == 0){
            for(int i = 0; i < inputString.length(); i += n){
                String partString = inputString.substring(i, i + n);
                System.out.print(partString + " ");
            }
        }
        else{
            System.out.println("KO");
        }
        scanner.close();
    }
}
