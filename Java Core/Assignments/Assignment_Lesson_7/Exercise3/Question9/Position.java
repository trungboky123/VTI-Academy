package Assignments.Assignment_Lesson_7.Exercise3.Question9;

public class Position {
    protected int id;
    protected String name;

    public Position(){
        ScannerUtils scanner = new ScannerUtils();
        id = scanner.inputInt();
        name = scanner.inputString();
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name;
    }
}
