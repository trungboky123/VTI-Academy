package Assignment_Lesson_7.Exercise3.Question4;

public class Department {
    protected int id;
    protected String name;

    public Department(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
