package Assignments.Assignment_Lesson_5.Exercise5.Question4;

public class Magazine extends Document{
    protected int publishNumber;
    protected int publishMonth;

    public Magazine(String id, String publisher, int numberOfProducts, int publishNumber, int publishMonth){
        super(id, publisher, numberOfProducts);
        this.publishNumber = publishNumber;
        this.publishMonth = publishMonth;
    }

    @Override
    public void printInfo(){
        System.out.println("ID: " + id + ", Publisher: " + publisher + "Number of Products: " + numberOfProducts + ", Publish Number: " + publishNumber + ", Publish Month: " + publishMonth);
    }
}
