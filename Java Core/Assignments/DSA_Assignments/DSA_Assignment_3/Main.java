package Assignments.DSA_Assignments.DSA_Assignment_3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElectronicStore electronicStore = new ElectronicStore();
        Scanner scanner = new Scanner(System.in);
        while (true){
            try{
                System.out.println("---Device Store---");
                System.out.println("1. Add device");
                System.out.println("2. Display devices");
                System.out.println("3. Search device by code");
                System.out.println("4. List of printers used for A4 sheet");
                System.out.println("5. Get top 3 computers with highest price in store");
                System.out.println("6. Exit store");
                System.out.println("Enter your choice (1-6): ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        electronicStore.input();
                        break;
                    case 2:
                        electronicStore.display();
                        break;
                    case 3:
                        System.out.println("Enter code: ");
                        String code = scanner.nextLine();
                        System.out.println(electronicStore.findByCode(code));
                        break;
                    case 4:
                        System.out.println("List of printers used for A4 sheet: ");
                        System.out.println(electronicStore.findBySheetSize("A4"));
                        break;
                    case 5:
                        System.out.println("Top 3 computers with highest price in store: ");
                        List<ElectronicDevice> list = electronicStore.getTopComputerHighestPrice(3);
                        for(ElectronicDevice computer : list){
                            computer.display();
                        }
                        break;
                    case 6:
                        System.out.println("Exitting store...");
                        System.out.println("Successully!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } catch (NumberFormatException e){
                System.out.println("Choice must be an integer value! Please try again.");
            }
        }
    }
}
