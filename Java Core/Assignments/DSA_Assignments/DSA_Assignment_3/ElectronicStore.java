package Assignments.DSA_Assignments.DSA_Assignment_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ElectronicStore {
    List<ElectronicDevice> listDevice = new LinkedList<>();

    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter type");
            System.out.println("1. Computer");
            System.out.println("2. Printer");

            int type;
            while (true){
                try{
                    type = Integer.parseInt(scanner.nextLine());
                    if(type == 1 || type == 2){
                        break;
                    }
                    else {
                        System.out.println("Only 1 or 2 can be accepted!");
                    }
                } catch (NumberFormatException e){
                    System.out.println("Please enter an integer value!");
                }
            }

            String code;
            while (true){
                System.out.println("Enter code (starting with 'ED' + 3 numbers: ");
                code = scanner.nextLine();
                if(code.matches("^ED\\d{3}$")){
                    break;
                }
                else {
                    System.out.println("Invalid code. Please enter again!");
                }
            }

            System.out.println("Enter device name: ");
            String name = scanner.nextLine();

            System.out.println("Enter producer: ");
            String producer = scanner.nextLine();

            double price;
            while (true){
                try{
                    System.out.println("Enter price: ");
                    price = Double.parseDouble(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("Price must be an integer value!");
                }
            }

            String quantity;
            while (true){
                try{
                    System.out.println("Enter quantity (>1): ");
                    quantity = scanner.nextLine();
                    int intQuantity = Integer.parseInt(quantity);
                    if(intQuantity > 1){
                        break;
                    }
                    else {
                        System.out.println("Quantity must be greater than 1!");
                    }
                } catch (NumberFormatException e){
                    System.out.println("Quantity must be an integer value!");
                }
            }

            if(type == 1){
                int battery;
                while (true){
                    try{
                        System.out.println("Enter battery (Wh): ");
                        battery = Integer.parseInt(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Battery must be an integer value!");
                    }
                }

                System.out.println("Enter screen size: ");
                String screen = scanner.nextLine();

                System.out.println("Enter RAM: ");
                String ram = scanner.nextLine();

                System.out.println("Enter CPU: ");
                String cpu = scanner.nextLine();

                Computer computer = new Computer(code, name, producer, price, quantity, battery, screen, ram, cpu);
                listDevice.add(computer);
            }
            else {
                String sheetSize;
                while (true){
                    System.out.println("Enter sheet size (A0 - A8): ");
                    sheetSize = scanner.nextLine().toUpperCase();
                    if(sheetSize.matches("A[0-8]")){
                        break;
                    }
                    else {
                        System.out.println("Invalid sheet size!");
                    }
                }

                float width;
                while (true){
                    try{
                        System.out.println("Enter width: ");
                        width = Float.parseFloat(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Width must be a float value!");
                    }
                }

                float height;
                while (true){
                    try{
                        System.out.println("Enter height: ");
                        height = Float.parseFloat(scanner.nextLine());
                        break;
                    } catch (NumberFormatException e){
                        System.out.println("Height must be a float value!");
                    }
                }

                Printer printer = new Printer(code, name, producer, price, quantity, sheetSize, width, height);
                listDevice.add(printer);
            }
            System.out.println("Added device successfully!");
            return true;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public void display(){
        for (ElectronicDevice device : listDevice) {
            device.display();
        }
    }

    public ElectronicDevice findByCode(String code){
        for(ElectronicDevice device : listDevice){
            if(device.code.equalsIgnoreCase(code)){
                return device;
            }
        }
        return null;
    }

    public List<ElectronicDevice> findBySheetSize(String sheetSize){
        List<ElectronicDevice> a4Printer = new ArrayList<>();
        for(ElectronicDevice device : listDevice){
            if(device instanceof Printer printer && printer.sheetSize.equalsIgnoreCase(sheetSize)){
                a4Printer.add(device);
            }
        }
        return a4Printer;
    }

    public List<ElectronicDevice> getTopComputerHighestPrice(int top){
        Stream<ElectronicDevice> streamList = listDevice.stream();
        List<ElectronicDevice> topComputer = streamList.filter(d -> d instanceof Computer).sorted((d1, d2) -> Double.compare(d2.price, d1.price)).limit(top).toList();
        return topComputer;
    }
}
