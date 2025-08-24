package Assignments.Assignment_Lesson_13.Exercise2.Question8;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteAccount {
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

    public static void deleteAccount(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        if(!doesAccountIdExist(id)){
            throw new Exception("Account does not exist!");
        }
        String sql = "DELETE FROM account where Account_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        int rowsAffected = statement.executeUpdate();
        if(rowsAffected > 0){
            System.out.println("Deleted successfully!");
        }
        else{
            System.out.println("Failed to delete account!");
        }
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter account id you want to delete: ");
            int id = scanner.nextInt();
            deleteAccount(id);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
