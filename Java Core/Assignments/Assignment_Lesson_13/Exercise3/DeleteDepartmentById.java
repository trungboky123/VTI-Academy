package Assignments.Assignment_Lesson_13.Exercise3.Question1;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.CallableStatement;
import java.sql.Connection;

public class DeleteDepartmentById {
    public static void deleteDepartmentById(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        if(!CheckDepartmentById.doesDepartmentIdExist(id)){
            throw new Exception("Department does not exist!");
        }
        String sql = "{Call sp_delete_department(?)}";
        CallableStatement statement = connection.prepareCall(sql);
        statement.setInt(1, id);
        int rowsAffected = statement.executeUpdate();
        if(rowsAffected > 0){
            System.out.println("Deleted successfully!");
        }
        else{
            System.out.println("Failed to delete department!");
        }
    }
}
