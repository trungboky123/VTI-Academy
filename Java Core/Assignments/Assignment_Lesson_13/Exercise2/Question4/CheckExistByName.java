package Assignments.Assignment_Lesson_13.Exercise2.Question4;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckExistByName {
    public static boolean doesDepartmentNameExist(String departmentName) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT COUNT(*) FROM department WHERE Department_Name = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, departmentName);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        return count > 0;
    }
}
