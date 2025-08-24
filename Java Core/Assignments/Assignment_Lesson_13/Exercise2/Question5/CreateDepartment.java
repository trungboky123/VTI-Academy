package Assignments.Assignment_Lesson_13.Exercise2.Question5;

import Assignments.Assignment_Lesson_13.Exercise2.Question4.CheckExistByName;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateDepartment {
    public static void createDepartment(String departmentName) throws Exception {
        Connection connection = MyConnection.getConnection();
        boolean check = CheckExistByName.doesDepartmentNameExist(departmentName);
        if(!check){
            String sql = "INSERT INTO department(Department_Name) VALUES(?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, departmentName);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Added successfully!");
            }
            else{
                System.out.println("Failed to added department!");
            }
        }
        else{
            throw new Exception("Department " + departmentName + " existed!");
        }
    }
}
