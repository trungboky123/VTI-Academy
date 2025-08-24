package Assignments.Assignment_Lesson_13.Exercise2.Question8;

import Assignments.Assignment_Lesson_1.Question1.Account;
import Assignments.Assignment_Lesson_1.Question1.Department;
import Assignments.Assignment_Lesson_1.Question1.Position;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.Scanner;

public class GetAccountById {
    public static Account getAccountById(int accountId) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT * FROM account a join department d on a.Department_ID = d.Department_ID join job_position p on a.Position_ID = p.Position_ID WHERE Account_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, accountId);
        ResultSet resultSet = statement.executeQuery();
        Account account = null;
        while (resultSet.next()){
            int id = resultSet.getInt("Account_ID");
            String email = resultSet.getString("Email");
            String fullName = resultSet.getString("Full_Name");
            String gender = resultSet.getString("Gender");
            String username = resultSet.getString("Account_Username");
            int deptId = resultSet.getInt("Department_ID");
            String deptName = resultSet.getString("Department_Name");
            Department department = new Department(deptId, deptName);
            int poId = resultSet.getInt("Position_ID");
            String poName = resultSet.getString("Position_Name");
            Position position = new Position(poId, poName);
            LocalDate createDate = resultSet.getDate("Create_Date").toLocalDate();
            account = new Account(id, email, username, fullName, gender, department, position, createDate);
        }
        return account;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter account id you want to see: ");
            int id = scanner.nextInt();
            Account account = getAccountById(id);
            if(account == null){
                throw new Exception("Cannot find account with id = " + id);
            }
            else{
                System.out.println(account);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
