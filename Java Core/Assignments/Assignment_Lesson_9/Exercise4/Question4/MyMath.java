package Assignments.Assignment_Lesson_9.Exercise4.Question4;

public class MyMath {
    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number> double sum(T a, T b, T c){
        return a.doubleValue() + b.doubleValue() + c.doubleValue();
    }

    public static <T extends Number> double sum(T a, T b, T c, T d){
        return a.doubleValue() + b.doubleValue() + c.doubleValue() + d.doubleValue();
    }

    public static <T extends Number> double subtraction(T a, T b){
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number> double power(T a, T b){
        return Math.pow(a.doubleValue(), b.doubleValue());
    }
}
