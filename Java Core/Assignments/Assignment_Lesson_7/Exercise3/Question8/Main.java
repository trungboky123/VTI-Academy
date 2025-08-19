package Assignments.Assignment_Lesson_7.Exercise3.Question8;

public class Main {
    public static void main(String[] args) {
        float floatValue = FloatValue.inputFloat("Enter a valid float value!");
        double doubleValue = DoubleValue.inputDouble("Enter a valid double value!");
        String stringValue = StringValue.inputString();

        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(stringValue);
    }
}
