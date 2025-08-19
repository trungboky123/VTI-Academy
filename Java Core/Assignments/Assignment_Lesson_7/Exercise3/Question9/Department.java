package Assignments.Assignment_Lesson_7.Exercise3.Question9;

public class Department {
    protected int id;
    protected String name;

    public Department(){
        ScannerUtils scanner = new ScannerUtils();
        id = scanner.inputInt();
        name = scanner.inputString();
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
