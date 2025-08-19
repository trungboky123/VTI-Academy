package Assignments.Assignment_Lesson_5.Exercise5.Question4;

public abstract class Document {
    protected String id;
    protected String publisher;
    protected int numberOfProducts;

    public Document(String id, String publisher, int numberOfProducts){
        this.id = id;
        this.publisher = publisher;
        this.numberOfProducts = numberOfProducts;
    }

    public abstract void printInfo();
}
