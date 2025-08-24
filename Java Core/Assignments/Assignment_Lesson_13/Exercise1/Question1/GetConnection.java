package Assignments.Assignment_Lesson_13.Exercise1.Question1;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
    public static Connection getConnection() throws Exception{
        try{
            String url = "jdbc:mysql://localhost:3306/testingsystem";
            String user = "root";
            String pass = "memelord1";
            Connection connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully");
            return connection;
        } catch (Exception e){
            throw new Exception("Connect fail");
        }
    }
}
