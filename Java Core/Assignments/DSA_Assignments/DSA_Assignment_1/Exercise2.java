package Assignments.DSA_Assignments.DSA_Assignment_1;

import java.util.Scanner;

public class Exercise2 {
    public static void SelectionSort(int arr[], int n){
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println("Sorted array after " + (i + 1) + " steps: ");
            for(int k = 0; k < n; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
        System.out.println("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[100];
        int count = 0;
        String choice;
        do{
            System.out.println("Enter a number: ");
            arr[count] = scanner.nextInt();
            count++;
            System.out.println("Want to add more elements? (Enter y/n): ");
            choice = scanner.next();
        } while (choice.equals("y"));
        System.out.println("Unsorted array: ");
        for(int i = 0; i < count; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        SelectionSort(arr, count);
        scanner.close();
    }
}
