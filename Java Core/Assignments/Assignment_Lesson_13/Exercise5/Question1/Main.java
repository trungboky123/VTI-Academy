package Assignments.Assignment_Lesson_13.Exercise5.Question1;

public class Main {
    public static void main(String[] args) {
        try{
            TestConnection.isConnectedForTesting();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
