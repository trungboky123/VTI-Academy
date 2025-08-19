package Assignments.Assignment_Lesson_9.Exercise3.Question8;

public class Main {
    public static void main(String[] args) {
        Staff<Integer, String> s1 = new Staff<>(1, "Hien");
        Staff<Long, String> s2 = new Staff<>(100l, "Huong");

        System.out.println(s1);
        System.out.println(s2);
    }
}
