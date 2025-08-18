package Exercise1.Question2;

public class Student {
    protected int id;
    protected String name;
    protected static String college;
    protected static double moneyGroup = 0;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(String string) {
        //TODO Auto-generated constructor stub
    }

    public String getStudentId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentId'");
    }

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}
