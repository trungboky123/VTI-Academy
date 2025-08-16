package Assignment_Lesson_12.Exercise2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Benefit {
    protected String name;
    protected String thumbnailUrl;
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter thumbnail url: ");
        thumbnailUrl = scanner.nextLine();

        try {
            do {
                System.out.println("Enter start date: ");
                startDate = LocalDate.parse(scanner.nextLine(), formatter);
                System.out.println("Enter end date: ");
                String stringEndDate = scanner.nextLine();
                if(!stringEndDate.isEmpty()){
                    endDate = LocalDate.parse(stringEndDate, formatter);
                }
                else{
                    endDate = null;
                }
            } while (endDate != null && endDate.isBefore(startDate));
        } catch (Exception e) {
            System.out.println("Invalid date format. Please input again !");
            return;
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Thumbnail URL: " + thumbnailUrl + ", Start Date: " + startDate + ", End Date: " + endDate; 
    }
}
