package Exercise5;

import java.util.Arrays;
import java.util.Comparator;

import Exercise5.Question1.Department;

public class Question6 {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.id = 1;
        d1.name = "Sale";
        Department d2 = new Department();
        d2.id = 2;
        d2.name = "Marketting";
        Department d3 = new Department();
        d3.id = 3;
        d3.name = "IT";
        Department d4 = new Department();
        d4.id = 4;
        d4.name = "Waiting Room";
        Department d5 = new Department();
        d5.id = 5;
        d5.name = "Accounting";
        Department [] departments = {d1, d2, d3, d4, d5};
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department d1, Department d2){
                return d1.name.compareTo(d2.name);
            }
        });
        System.out.println("Sorted Department: ");
        for(Department dept : departments){
            System.out.println(dept.name);
        }
    }
}
