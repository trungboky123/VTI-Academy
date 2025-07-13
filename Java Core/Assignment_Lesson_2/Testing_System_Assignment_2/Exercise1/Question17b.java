package Exercise1;

import Sources.Department;

public class Question17b {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sale");
        Department d2 = new Department(2, "Marketting");

        Department [] departments = {d1, d2};
        int i = 0;

        do{
            System.out.println("Department " + (i + 1));
            System.out.println("Department ID: " + departments[i].id);
            System.out.println("Department Name: " + departments[i].name);
            i++;
        } while (i < departments.length);
    }
}
