package Assignments.Assignment_Lesson_13.Exercise5.Question2;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Connect {
    public static Connection connection;

    public static Connection connect() throws Exception{
        try{
            if(connection == null || connection.isClosed()){
                Properties properties = new Properties();
                properties.load(new FileInputStream("Resources/Application.properties"));
                String url = properties.getProperty("Url");
                String user = properties.getProperty("User");
                String pass = properties.getProperty("Password");
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("New connection created!");
            }
            else{
                System.out.println("Using existing connection!");
            }
            return connection;
        } catch (Exception e){
            throw new Exception("Cannot connect to database!");
        }
    }
}
