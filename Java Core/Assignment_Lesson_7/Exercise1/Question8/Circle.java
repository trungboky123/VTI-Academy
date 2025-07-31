package Assignment_Lesson_7.Exercise1.Question8;

public class Circle extends Geometry{
    protected double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public double calculateArea(){
        return radius * radius * Math.PI;
    }
}
