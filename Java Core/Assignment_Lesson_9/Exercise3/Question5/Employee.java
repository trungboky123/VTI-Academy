package Assignment_Lesson_9.Exercise3.Question5;

public class Employee<T> {
    public int id;
    public String name;
    public T[] salary;

    public Employee(int id, String name, T[] salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.print("Salary: ");
        for (T s : salary) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printSalaryOfLastMonth(){
        System.out.print("Last Salary: ");
        if(salary.length > 0){
            System.out.println(salary[salary.length - 1]);
        }
    }
}
