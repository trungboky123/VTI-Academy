package Exercise2.Question1;

public class Student implements IStudent{
    protected int id;
    protected String name;
    protected int group;

    public Student(int id, String name, int group){
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public void attendanceCheck(){
        System.out.println(name + " yes");
    }

    @Override
    public void studying(){
        System.out.println(name + " is studying");
    }

    @Override
    public void cleaning(){
        System.out.println(name + " is cleaning");
    }
}
