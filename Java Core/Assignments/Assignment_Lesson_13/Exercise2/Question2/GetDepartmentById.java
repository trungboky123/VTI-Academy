package Assignments.Assignment_Lesson_13.Exercise2.Question2;

import Assignments.Assignment_Lesson_1.Question1.Department;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetDepartmentById {
    public static Department getDepartmentById(int departmentId) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT * FROM department where Department_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, departmentId);
        ResultSet resultSet = statement.executeQuery();
        Department department = null;
        while (resultSet.next()){
            int id = resultSet.getInt("Department_ID");
            String name = resultSet.getString("Department_Name");
            department = new Department(id, name);
        }
        return department;
    }
}
