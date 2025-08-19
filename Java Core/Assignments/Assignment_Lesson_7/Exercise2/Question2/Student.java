package Assignments.Assignment_Lesson_7.Exercise2.Question2;

public class Student {
    protected final int id;
    protected String name;

    public Student(final int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
