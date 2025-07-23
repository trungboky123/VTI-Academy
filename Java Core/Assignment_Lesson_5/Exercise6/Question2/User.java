package Assignment_Lesson_5.Exercise6.Question2;

public abstract class User {
    private String name;
    private double salaryRatio;

    public User(String name, double salaryRatio){
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalaryRatio(){
        return this.salaryRatio;
    }

    public void setSalaryRatio(double salaryRatio){
        this.salaryRatio = salaryRatio;
    }

    public abstract double calculatePay();

    public void displayInfor(){
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRatio);
        System.out.println("Total Salary: " + calculatePay());
    }
}
