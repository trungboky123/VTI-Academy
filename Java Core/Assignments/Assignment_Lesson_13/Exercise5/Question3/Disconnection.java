package Assignments.Assignment_Lesson_13.Exercise5.Question3;

import java.sql.Connection;

public class Disconnection {
    public static Connection connection;

    public static void disconnect() throws Exception {
        try{
            if(connection != null && !connection.isClosed()){
                connection.close();
                System.out.println("Connection closed!");
            }
            else{
                System.out.println("No active connection!");
            }
        } catch (Exception e){
            throw new Exception("Cannot disconnect from database: " + e.getMessage());
        }
    }
}
