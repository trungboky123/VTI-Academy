package Assignments.Assignment_Lesson_13.Exercise1.Question2;

import Assignments.Assignment_Lesson_1.Question1.Position;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetPosition {
    public static List<Position> getPosition() throws Exception{
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT * FROM job_position";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<Position> positions = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("Position_ID");
            String name = resultSet.getString("Position_Name");
            Position position = new Position(id, name);
            positions.add(position);
        }
        Collections.sort(positions, (p1, p2) -> Integer.compare(p1.id, p2.id));
        return positions;
    }
}
