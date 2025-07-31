package Assignment_Lesson_7.Exercise1.Question8;

public abstract class Geometry {
    protected static int count = 0;

    public Geometry(){
        if(count >= Configs.maxGeometry){
            throw new RuntimeException("Maximum of geometry reached!");
        }
        count++;
    }

    public abstract double calculatePerimeter();
    public abstract double calculateArea();
}
