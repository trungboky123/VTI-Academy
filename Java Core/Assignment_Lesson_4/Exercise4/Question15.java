package Exercise4;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String inputString = scanner.nextLine();
      String [] arrString = inputString.trim().split("\\s+");
      String revertedString = "";
      for(int i = arrString.length - 1; i >= 0; i--){
        revertedString += arrString[i] + " ";
      }  
      System.out.println("Reverted string: " + revertedString);
      scanner.close();
    }
}
