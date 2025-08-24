package Assignments.Assignment_Lesson_13.Exercise2.Question8;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateAccount {
    public static boolean doesAccountIdExist(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT COUNT(*) FROM account WHERE Account_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        return count > 0;
    }

    public static void updateAccountById(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "";
        PreparedStatement statement;
        int rowsAffected;
        Scanner scanner = new Scanner(System.in);
        if(!doesAccountIdExist(id)){
            throw new Exception("Account does not exist!");
        }
        System.out.println("Enter field (choose number) you want to update(1. Email, 2. Full_Name, 3. Gender, 4. Account_Username, 5. Department_ID, 6. Position_ID");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Enter new email: ");
                String newEmail = scanner.nextLine();
                sql = "UPDATE account SET Email = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, newEmail);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            case 2:
                System.out.println("Enter new full name: ");
                String fullName = scanner.nextLine();
                sql = "UPDATE account SET Full_Name = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, fullName);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            case 3:
                System.out.println("Enter new gender: ");
                String gender = scanner.nextLine();
                sql = "UPDATE account SET Gender = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, gender);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            case 4:
                System.out.println("Enter new username: ");
                String username = scanner.nextLine();
                sql = "UPDATE account SET Account_Username = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, username);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            case 5:
                System.out.println("Enter new department id: ");
                String deptId = scanner.nextLine();
                sql = "UPDATE account SET Department_ID = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, deptId);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            case 6:
                System.out.println("Enter new position id: ");
                String poId = scanner.nextLine();
                sql = "UPDATE account SET Position_ID = ? WHERE Account_ID = ?";
                statement = connection.prepareStatement(sql);
                statement.setString(1, poId);
                statement.setInt(2, id);
                rowsAffected = statement.executeUpdate();
                if(rowsAffected > 0){
                    System.out.println("Updated successfully!");
                }
                else{
                    throw new Exception("Failed to update account!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter account id you want to update info: ");
            int id = Integer.parseInt(scanner.nextLine());
            updateAccountById(id);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
