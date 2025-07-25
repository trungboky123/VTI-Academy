package Assignment_Lesson_6.Exercise2.Question2;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birthDate;
    private String address;

    public Person(){

    }

    public Person(String name, String gender, String birthDate, String address){
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getBirthDate(){
        return this.birthDate;
    }

    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter date of birth: ");
        birthDate = scanner.nextLine();
        System.out.println("Enter address: ");
        address = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of birth: " + birthDate);
        System.out.println("Address: " + address);
    }
}
