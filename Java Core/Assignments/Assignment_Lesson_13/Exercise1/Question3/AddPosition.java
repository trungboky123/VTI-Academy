package Assignments.Assignment_Lesson_13.Exercise1.Question3;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddPosition {
    public static int addPosition(String positionName) throws Exception{
        Connection connection = MyConnection.getConnection();
        String sql = "INSERT INTO job_position(Position_Name) VALUES(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, positionName);
        return statement.executeUpdate();
    }
}
