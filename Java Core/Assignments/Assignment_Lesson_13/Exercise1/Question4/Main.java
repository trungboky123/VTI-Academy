package Assignments.Assignment_Lesson_13.Exercise1.Question4;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = UpdatePosition.updatePosition(5, "DEV");
        if(result > 0){
            System.out.println("Updated successfully!");
        }
        else{
            System.out.println("Cannot find the position with ID = 5");
        }
    }
}
