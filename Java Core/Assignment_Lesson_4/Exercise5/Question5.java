package Exercise5;

import Exercise5.Question1.Department;

public class Question5 {
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
        if(d1.name.equals(d2.name)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
