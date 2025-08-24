package Assignments.Assignment_Lesson_13.Exercise2.Question1;

import Assignments.Assignment_Lesson_1.Question1.Department;
import Assignments.Assignment_Lesson_13.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetDepartments {
    public static List<Department> getDepartments() throws Exception {
        Connection connection = MyConnection.getConnection();
        String sql = "SELECT * FROM department";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Department> departments = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("Department_ID");
            String name = resultSet.getString("Department_Name");
            Department department = new Department(id, name);
            departments.add(department);
        }
        Collections.sort(departments, (d1, d2) -> Integer.compare(d1.id, d2.id));
        return departments;
    }
}
