package Assignments.DSA_Assignments.DSA_Assignment_3;

public class Printer extends ElectronicDevice{
    protected String sheetSize;
    protected float width;
    protected float height;

    public Printer(String code, String name, String producer, double price, String quantity, String sheetSize, float width, float height){
        super(code, name, producer, price, quantity);
        this.sheetSize = sheetSize;
        this.width = width;
        this.height = height;
    }

    @Override
    public void display() {
        System.out.println("Printer: " + code + ", " + name + ", " + producer + ", " + price +
                ", " + quantity + ", " + sheetSize + ", " + width + ", " + height);
    }
}
