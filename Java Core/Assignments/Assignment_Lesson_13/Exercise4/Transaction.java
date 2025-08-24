package Assignments.Assignment_Lesson_13.Exercise4;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;

public class Transaction {
    public static void deleteDepartment11WithAccounts() throws Exception {
        Connection connection = MyConnection.getConnection();
        connection.setAutoCommit(false);
        try{
            DeleteAccountByDepartment.deleteAccountByDepartmentId(connection);
            DeleteDepartment.deleteDepartment(connection);
            connection.commit();
            System.out.println("Deleted successfully!");
        } catch (Exception e){
            connection.rollback();
            System.out.println("Error occured!");
        } finally {
            connection.setAutoCommit(true);
            connection.close();
        }
    }
}
