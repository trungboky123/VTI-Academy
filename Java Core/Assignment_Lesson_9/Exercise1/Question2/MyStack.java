package Exercise1.Question2;

import java.util.Stack;

public class MyStack {
    public static void printOrderByStack(){
        Stack<String> students = new Stack<>();
        students.push("Nguyen Van Nam");
        students.push("Nguyen Van Huyen");
        students.push("Tran Van Nam");
        students.push("Nguyen Van A");

        System.out.println("Order from latest to earliest: ");
        while (!students.isEmpty()) {
            System.out.println(students.pop());
        }
    }
}
