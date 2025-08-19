package Assignments.Assignment_Lesson_6.Exercise2.Question2;

import java.util.Scanner;

public class Student extends Person{
    protected String studentID;
    protected double averageScore;
    protected String email;

    public Student(){
        super();
    }

    public Student(String name, String gender, String birthDate, String address, String studentID, double averageScore, String email){
        super(name, gender, birthDate, address);
        this.studentID = studentID;
        this.averageScore = averageScore;
        this.email = email;
    }

    @Override
    public void inputInfo(){
        super.inputInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID: ");
        studentID = scanner.nextLine();
        System.out.println("Enter average score: ");
        averageScore = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter email: ");
        email = scanner.nextLine();
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Student ID: " + studentID);
        System.out.println("Average score: " + averageScore);
        System.out.println("Email: " + email);
    }

    public boolean gotScholarship(){
        return averageScore >= 8.0;
    }
}
