package Assignments.Assignment_Lesson_7.Exercise1.Question7;

public class Student {
    protected static int count = 0;
    protected static final int max = 7;

    public Student(){
        if(count >= max){
            throw new RuntimeException("Maximum of student reached!");
        }
        count++;
    }
}
