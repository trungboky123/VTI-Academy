package Assignment_Lesson_5.Exercise5.Question1;

public class Employee extends Staff{
    private String work;

    public Employee(String fullName, int age, Gender gender, String address, String work){
        super(fullName, age, gender, address);
        this.work = work;
    }

    public String getWork(){
        return this.work;
    }

    public void setWork(String work){
        this.work = work;
    }

    @Override 
    public String toString(){
        return super.toString() + ", work: " + work;
    }
}
