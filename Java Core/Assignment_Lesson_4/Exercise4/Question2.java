package Exercise4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter s1: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter s2: ");
        String s2 = scanner.nextLine();
        String s3 = s1 + " " + s2;
        System.out.println("Connected string: " + s3);
        scanner.close();
    }
}
