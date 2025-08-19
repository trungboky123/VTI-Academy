package Assignments.Assignment_Lesson_9.Exercise3.Question1;

public class Student<T> {
    public T id;
    public String name;

    public Student(T id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
