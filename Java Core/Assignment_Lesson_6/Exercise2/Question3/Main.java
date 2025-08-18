package Exercise2.Question3;

public class Main {
    public static void main(String[] args){
        Rectangular rectangular = new Rectangular(3,5);
        rectangular.calculatePerimeter();
        rectangular.calculateArea();


        Square square = new Square(5);
        square.calculatePerimeter();
        square.calculateArea();
    }
}
