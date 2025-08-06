package Assignment_Lesson_9.Exercise1.Question1;

public class Student {
    protected static int autoId = 1;
    protected int id;
    protected String name;

    public Student(String name){
        this.id = autoId++;
        this.name = name;
    }

    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
