package Assignments.Assignment_Lesson_13;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection getConnection() throws Exception{
        String url = "jdbc:mysql://localhost:3306/testingsystem";
        String user = "root";
        String pass = "memelord1";
        return DriverManager.getConnection(url, user, pass);
    }
}
