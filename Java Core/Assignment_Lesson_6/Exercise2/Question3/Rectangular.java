package Exercise2.Question3;

public class Rectangular {
    protected double length;
    protected double width;

    public Rectangular(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangular: " + perimeter);
        return perimeter;
    }

    public double calculateArea(){
        double area = length * width;
        System.out.println("Area of the rectangular: " + area);
        return area;
    }
}
