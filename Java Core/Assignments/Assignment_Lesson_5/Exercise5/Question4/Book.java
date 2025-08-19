package Assignments.Assignment_Lesson_5.Exercise5.Question4;

public class Book extends Document{
    protected String author;
    protected int numberOfPages;

    public Book(String id, String publisher, int numberOfProducts, String author, int numberOfPages){
        super(id, publisher, numberOfProducts);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void printInfo(){
        System.out.println("ID: " + id + ", Publisher: " + publisher + "Number of Products: " + numberOfProducts + ", Author: " + author + ", Number of Pages: " + numberOfPages);
    }
}
