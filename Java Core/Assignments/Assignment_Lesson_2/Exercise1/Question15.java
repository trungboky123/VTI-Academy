package Assignments.Assignment_Lesson_2.Exercise1;

public class Question15 {
    public static void main(String[] args) {
        System.out.println("All the even numbers smaller or equal than 20 are: ");
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
