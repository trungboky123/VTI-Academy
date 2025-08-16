package Assignment_Lesson_12.Exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class TelephoneConsultant extends Benefit{
    protected int duration;

    @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter duration: ");
        duration = Integer.parseInt(scanner.nextLine());
    }

    public boolean isAvailable(){
        return endDate == null || endDate.isAfter(LocalDate.now());
    }

    @Override 
    public String toString(){
        return super.toString() + ", Duration: " + duration;
    }
}
