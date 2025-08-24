package Assignments.Assignment_Lesson_13.Exercise4;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDepartment {
    public static void deleteDepartment(Connection connection) throws Exception {
        String sql = "DELETE FROM department WHERE Department_ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, 3);
        statement.executeUpdate();
    }
}
