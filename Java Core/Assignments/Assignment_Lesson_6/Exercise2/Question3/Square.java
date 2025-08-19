package Assignments.Assignment_Lesson_6.Exercise2.Question3;

public class Square extends Rectangular{
    protected double side;

    public Square(double side){
        super(side, side);
    }

    public double calculatePerimeter(){
        System.out.println("Perimeter of the square: ");
        return super.calculatePerimeter();
    }

    @Override
    public  double calculateArea(){
        System.out.println("Area of the square: ");
        return super.calculateArea();
    }
}
