package Assignment_Lesson_9.Exercise3.Question4;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Float[] floatArray = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        Long[] longArray = {100l, 200l, 300l, 400l, 500l};
        Double[] doubleArray = {1.55, 2.55, 3.55, 4.55, 5.55};

        System.out.print("Integer Array: ");
        GenericMethods.printArray(intArray);

        System.out.print("Float Array: ");
        GenericMethods.printArray(floatArray);

        System.out.print("Long Array: ");
        GenericMethods.printArray(longArray);

        System.out.print("Double Array: ");
        GenericMethods.printArray(doubleArray);
    }
}
