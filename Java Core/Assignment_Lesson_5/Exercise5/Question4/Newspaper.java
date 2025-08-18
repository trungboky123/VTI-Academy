package Exercise5.Question4;

public class Newspaper extends Document{
    protected int publishDay;

    public Newspaper(String id, String publisher, int numberOfProducts, int publishDay){
        super(id, publisher, numberOfProducts);
        this.publishDay = publishDay;
    }

    @Override
    public void printInfo(){
        System.out.println("ID: " + id + ", Publisher: " + publisher + "Number of Products: " + numberOfProducts + ", Publish Day: " + publishDay);
    }
}
