package Assignments.Assignment_Lesson_13.Exercise3.Question1;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckDepartmentById {
    public static boolean doesDepartmentIdExist(int id) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT COUNT(*) FROM department WHERE Department_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int count = resultSet.getInt(1);
        return count > 0;
    }
}
