package Assignments.Assignment_Lesson_5.Exercise5.Question1;

public class Staff {
    private String fullName;
    private int age;
    private Gender gender;
    private String address;

    public Staff(String fullName, int age, Gender gender, String address){
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Gender getGender(){
        return this.gender;
    }

    public void setGender(Gender gender){
        this.gender = gender;
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString(){
        return "Full name: " + fullName + ", age: " + age + ", gender: " + gender + ", address: " + address;
    }
}
