package Exercise6.Question3;

import Exercise6.Question2.User;

public class Manager extends User{
    public Manager(String name, double salaryRatio){
        super(name, salaryRatio);
    }

    @Override
    public double calculatePay(){
        return getSalaryRatio() * 520;
    }
}
