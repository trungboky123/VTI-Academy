package Assignment_Lesson_5.Exercise5.Question3;

public class HighSchoolStudent extends Student{
    protected String clazz;
    protected String desiredUniversity;

    public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity){
        super(id, name);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", name: " + name + ", class: " + clazz + ", desired university: " + desiredUniversity;
    }
}
