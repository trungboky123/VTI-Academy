package Assignments.Assignment_Lesson_6.Exercise3.Question2;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Mazda", "8WD");
        Car.Engine engine = car.new Engine("Crysler");
        System.out.println(engine.getEngineType());
    }
}
