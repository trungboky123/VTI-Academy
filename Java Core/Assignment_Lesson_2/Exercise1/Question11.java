package Exercise1;

import Sources.Department;

public class Question11 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sale");
        Department d2 = new Department(2, "Marketting");

        Department [] departments = {d1, d2};

        for(int i = 0; i < departments.length; i++){
            System.out.println("Department " + (i + 1));
            System.out.println("Department ID: " + departments[i].id);
            System.out.println("Department Name: " + departments[i].name);
        }
    }
}
