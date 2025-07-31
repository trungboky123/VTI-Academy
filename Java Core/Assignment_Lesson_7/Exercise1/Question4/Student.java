package Assignment_Lesson_7.Exercise1.Question4;

public class Student {
    protected int id;
    protected String name;
    protected static String college;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void setCollege(String newCollege){
        college = newCollege;
    }

    public static String getCollege(){
        return college;
    }
}
