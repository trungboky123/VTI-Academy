package Exercise1.Question2;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void printOrderByQueue(){
        Queue<String> students = new LinkedList<>();
        students.add("Nguyen Van Nam");
        students.add("Nguyen Van Huyen");
        students.add("Tran Van Nam");
        students.add("Nguyen Van A");

        System.out.println("Order from latest to earliest: ");
        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}
