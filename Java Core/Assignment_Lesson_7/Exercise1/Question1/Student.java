package Assignment_Lesson_7.Exercise1.Question1;

public class Student {
    protected int id;
    protected String name;
    protected static String college;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", College: " + college;
    }
}
