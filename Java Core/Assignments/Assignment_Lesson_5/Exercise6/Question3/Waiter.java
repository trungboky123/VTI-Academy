package Assignments.Assignment_Lesson_5.Exercise6.Question3;

import Assignments.Assignment_Lesson_5.Exercise6.Question2.User;

public class Waiter extends User {
    public Waiter(String name, double salaryRatio){
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay(){
        return getSalaryRatio() * 220;
    }
}
