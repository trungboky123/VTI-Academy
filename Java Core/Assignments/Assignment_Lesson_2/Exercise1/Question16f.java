package Assignments.Assignment_Lesson_2.Exercise1;

public class Question16f {
    public static void main(String[] args) {
        System.out.println("All the even numbers smaller or equal than 20 are: ");
        int i = 0;
        while (i <= 20){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
