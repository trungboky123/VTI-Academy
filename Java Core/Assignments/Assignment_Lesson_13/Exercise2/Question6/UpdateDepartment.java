package Assignments.Assignment_Lesson_13.Exercise2.Question6;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDepartment {
    public static void updateDepartmentName(int id, String newName) throws Exception {
        Connection connection = MyConnection.getConnection();
        if(!CheckExistById.doesDepartmentIdExist(id)){
            throw new Exception("Cannot find department with id = " + id);
        }
        if(CheckExistByName.doesDepartmentNameExist(newName)){
            throw new Exception("Department name existed!");
        }
        String sql = "UPDATE department SET Department_Name = ? WHERE Department_ID = ?";
        PreparedStatement statement =connection.prepareStatement(sql);
        statement.setString(1, newName);
        statement.setInt(2, id);
        int rowAffected = statement.executeUpdate();
        if(rowAffected > 0){
            System.out.println("Updated department successfully!");
        }
        else{
            System.out.println("Failed to update department!");
        }
    }
}
