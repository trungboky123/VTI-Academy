package Assignments.Assignment_Lesson_13.Exercise1.Question4;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdatePosition {
    public static int updatePosition(int positionId, String positionName) throws Exception{
        Connection connection = MyConnection.getConnection();
        String sql = "UPDATE job_position set Position_Name = ? WHERE Position_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, positionName);
        statement.setInt(2, positionId);
        return statement.executeUpdate();
    }
}
