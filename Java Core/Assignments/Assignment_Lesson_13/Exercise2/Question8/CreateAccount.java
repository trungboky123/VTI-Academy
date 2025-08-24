package Assignments.Assignment_Lesson_13.Exercise2.Question8;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.Scanner;

public class CreateAccount {
    public static void createAccount(String email, String fullName, String gender, String userName, int departmentId, int positionId) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "INSERT INTO account(Email, Full_Name, Gender, Account_Username, Department_ID, Position_ID, Create_Date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, fullName);
        statement.setString(3, gender);
        statement.setString(4, userName);
        statement.setInt(5, departmentId);
        statement.setInt(6, positionId);
        statement.setDate(7, Date.valueOf(LocalDate.now()));
        int rowsAffected = statement.executeUpdate();
        if(rowsAffected > 0){
            System.out.println("Account added successfully!");
        }
        else{
            System.out.println("Failed to create account!");
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            System.out.println("Enter full name: ");
            String fullName = scanner.nextLine();
            System.out.println("Enter gender(Male, Female, Not Defined): ");
            String gender = scanner.nextLine();
            switch (gender.toLowerCase()){
                case "male":
                case "m":
                    gender = "Male";
                    break;
                case "female":
                case "f":
                    gender = "Female";
                    break;
                default:
                    gender = "Not Defined";
                    break;
            }
            System.out.println("Enter username: ");
            String userName = scanner.nextLine();
            System.out.println("Enter department id: ");
            int departmentId = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter position id: ");
            int positionId = Integer.parseInt(scanner.nextLine());
            createAccount(email, fullName, gender, userName, departmentId, positionId);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
