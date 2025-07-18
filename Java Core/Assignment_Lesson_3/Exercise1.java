import java.util.Scanner;

public class Exercise1 {
    public static void BubbleSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Sorted array after " + (i + 1) + " step(s): ");
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
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter element " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Unsorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort(arr, n);
        scanner.close();
    }
}
