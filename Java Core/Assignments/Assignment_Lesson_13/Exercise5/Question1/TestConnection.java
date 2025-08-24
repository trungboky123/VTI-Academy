package Assignments.Assignment_Lesson_13.Exercise5.Question1;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void isConnectedForTesting() throws Exception {
        try{
            String url = "jdbc:mysql://localhost:3306/testingsystem";
            String user = "root";
            String pass = "memelord1";
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!");
        } catch (Exception e){
            throw new Exception("Failed to connect to database!");
        }
    }
}
