package Assignments.Assignment_Lesson_9.Exercise4.Question1;

public class Salary<N extends Number> {
    public N salary;

    public Salary(N salary){
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Salary: " + salary);
    }
}
