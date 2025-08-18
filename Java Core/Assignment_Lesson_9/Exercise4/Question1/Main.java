package Exercise4.Question1;

public class Main {
    public static void main(String[] args) {
        Salary<Integer> s1 = new Salary<Integer>(3000000);
        Salary<Double> s2 = new Salary<Double>(4500000.5);

        s1.printSalary();
        s2.printSalary();
    }   
}
