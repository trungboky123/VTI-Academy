package Assignments.Assignment_Lesson_13.Exercise1.Question5;

import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeletePositionById {
    public static int deletePositionById(int positionId) throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "DELETE FROM Job_Position where Position_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, positionId);
        return statement.executeUpdate();
    }
}
