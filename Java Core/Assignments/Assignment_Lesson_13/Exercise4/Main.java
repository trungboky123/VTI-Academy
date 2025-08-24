package Assignments.Assignment_Lesson_13.Exercise4;

public class Main {
    public static void main(String[] args) {
        try{
            Transaction.deleteDepartment11WithAccounts();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
