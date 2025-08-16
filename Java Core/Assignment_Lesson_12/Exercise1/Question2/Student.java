package Assignment_Lesson_12.Exercise1.Question2;

public class Student {
    protected static int autoId = 1;
    protected int id;
    protected String name;

    public Student(String name){
        this.id = autoId++;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Deprecated
    public int getId(){
        return this.id;
    }

    public String getStudentId(){
        return "MSV: " + this.id;
    }
}
