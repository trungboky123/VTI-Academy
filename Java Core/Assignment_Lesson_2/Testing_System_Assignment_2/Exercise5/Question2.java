package Exercise5;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter 2 real numbers: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("You have entered " + x + " and " + y);
        scanner.close();
    }
}
