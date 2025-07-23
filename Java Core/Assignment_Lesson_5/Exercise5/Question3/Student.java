package Assignment_Lesson_5.Exercise5.Question3;

public  abstract class Student extends Person{
    protected int id;

    public Student(int id, String name){
        super(name);
        this.id = id;
    }
}
