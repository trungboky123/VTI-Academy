package Assignments.Assignment_Lesson_13.Exercise5.Question2;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try{
            Connection c1 = Connect.connect();
            Connection c2 = Connect.connect();
            c1.close();
            c2.close();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
