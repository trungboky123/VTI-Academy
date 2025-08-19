package Assignments.Assignment_Lesson_4.Exercise1;

import java.util.Scanner;

public class Question4 {
    public static double Divided(int a, int b){
        if(b == 0){
            System.out.println("Error!");;
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println(a + "/" + b + " = " + Divided(a, b));
        scanner.close();
    }
}
