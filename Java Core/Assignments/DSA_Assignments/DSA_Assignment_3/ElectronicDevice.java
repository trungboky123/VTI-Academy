package Assignments.DSA_Assignments.DSA_Assignment_3;

public abstract class ElectronicDevice {
    protected String code;
    protected String name;
    protected String producer;
    protected double price;
    protected String quantity;

    public ElectronicDevice(String code, String name, String producer, double price, String quantity){
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void display();
}
