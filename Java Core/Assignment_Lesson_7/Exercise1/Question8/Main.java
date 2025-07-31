package Assignment_Lesson_7.Exercise1.Question8;

public class Main {
    public static void main(String[] args) {
        try {
            Geometry g1 = new Circle(2);
            Geometry g2 = new Rectangular(2, 4);
            Geometry g3 = new Circle(5.5);
            Geometry g4 = new Rectangular(3.5, 6);
            Geometry g5 = new Circle(10);
            Geometry g6 = new Rectangular(5, 8.5);
            System.out.println(g1.calculatePerimeter());
            System.out.println(g2.calculateArea());
            System.out.println(g3.calculatePerimeter());
            System.out.println(g4.calculateArea());
            System.out.println(g5.calculatePerimeter());
            System.out.println(g6.calculateArea());
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
    }
}
