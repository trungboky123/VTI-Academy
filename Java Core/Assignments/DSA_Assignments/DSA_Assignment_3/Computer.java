package Assignments.DSA_Assignments.DSA_Assignment_3;

public class Computer extends ElectronicDevice{
    protected int battery;
    protected String screen;
    protected String ram;
    protected String cpu;

    public Computer(String code, String name, String producer, double price, String quantity, int battery, String screen, String ram, String cpu){
        super(code, name, producer, price, quantity);
        this.battery = battery;
        this.screen = screen;
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public void display() {
        System.out.println("Computer: " + code + ", " + name + ", " + producer + ", " + price +
                ", " + quantity + ", " + battery + "Wh, " + screen + ", " + ram + ", " + cpu);
    }
}
