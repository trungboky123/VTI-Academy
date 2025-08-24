package Assignments.Assignment_Lesson_13.Exercise5.Question3;

public class Main {
    public static void main(String[] args) {
        try{
            Disconnection.disconnect();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
