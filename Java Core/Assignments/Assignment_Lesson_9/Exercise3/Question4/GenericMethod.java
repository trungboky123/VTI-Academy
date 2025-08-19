package Assignments.Assignment_Lesson_9.Exercise3.Question4;

public class GenericMethod {
    public static <T> void printArray(T[] array){
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
