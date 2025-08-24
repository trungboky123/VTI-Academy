package Assignments.Assignment_Lesson_13.Exercise2.Question7;

import Assignments.Assignment_Lesson_13.Exercise2.Question6.CheckExistById;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDepartment {
    public static void deleteDepartment(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        boolean check = CheckExistById.doesDepartmentIdExist(id);
        if(check){
            String sql = "DELETE FROM Department WHERE Department_ID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected > 0){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Failed to delete department with id = " + id);
            }
        }
        else{
            throw new Exception("Cannot find department with id = " + id);
        }
    }
}
