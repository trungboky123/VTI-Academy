package Assignments.Assignment_Lesson_9.Exercise4.Question3;

public class GenericMethod {
    public static <N extends Number> N max(N a, N b){
        if(a.doubleValue() > b.doubleValue()){
            return a;
        }
        else{
            return b;
        }
    }
}
