package Assignment_Lesson_5.Exercise6.Question3;

import Assignment_Lesson_5.Exercise6.Question2.User;

public class Employee extends User{
    public Employee(String name, double salaryRatio){
        super(name, salaryRatio);
    }
    
    @Override
    public double calculatePay(){
        return getSalaryRatio() * 420;
    }
}
