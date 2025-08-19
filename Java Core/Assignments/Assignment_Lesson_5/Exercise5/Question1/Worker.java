package Assignments.Assignment_Lesson_5.Exercise5.Question1;

public class Worker extends Staff{
    private int level;

    public Worker(String fullName, int age, Gender gender, String address, int level){
        super(fullName, age, gender, address);
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    @Override
    public String toString(){
        return super.toString() + ", level: " + level;
    }
}
