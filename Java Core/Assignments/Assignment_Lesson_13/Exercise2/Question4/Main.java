package Assignments.Assignment_Lesson_13.Exercise2.Question4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter the department name you want to check: ");
            String name = scanner.nextLine();
            boolean result = CheckExistByName.doesDepartmentNameExist(name);
            if(result){
                System.out.println("Department with name " + name + " existed");
            }
            else{
                System.out.println("Department with name " + name + " did not exist");
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
