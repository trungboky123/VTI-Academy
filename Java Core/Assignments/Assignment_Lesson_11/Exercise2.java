package Assignments.Assignment_Lesson_11;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right)/2;
            if(arr[mid] == target){
                index = mid;
                break;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target: ");
        int target = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(arr);
        int index = BinarySearch(arr, target);
        if(index == -1){
            System.out.println("Cannot find the number " + target + " in the array");
        }
        else{
            System.out.println("Number " + target + " is found at index " + index + " in the array");
        }
        scanner.close();
    }
}
