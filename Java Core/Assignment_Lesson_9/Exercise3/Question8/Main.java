package Exercise3.Question8;

public class Main {
    public static void main(String[] args) {
        Staff<Integer, String> s1 = new Staff<Integer, String>(1, "Hien");
        Staff<Long, String> s2 = new Staff<Long ,String>(100l, "Huong");

        System.out.println(s1);
        System.out.println(s2);
    }
}
