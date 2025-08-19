package Assignments.Assignment_Lesson_11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
        for(int num : arr){
            int count = frequencyMap.getOrDefault(num, 0);
            frequencyMap.put(num, count + 1);
        }
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println("Number: " + entry.getKey() + ": " + entry.getValue() + " time(s)");
        }
        scanner.close();
    }
}
