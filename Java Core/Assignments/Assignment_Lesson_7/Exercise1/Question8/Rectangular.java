package Assignments.Assignment_Lesson_7.Exercise1.Question8;

public class Rectangular extends Geometry{
    protected double length;
    protected double width;

    public Rectangular(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter(){
        return (length + width) * 2;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
}
