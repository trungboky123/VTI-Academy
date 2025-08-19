package Assignments.Assignment_Lesson_9.Exercise3.Question5;

public class Main {
    public static void main(String[] args) {
        Integer[] intSalary = {3000000, 5000000, 10000000};
        Float[] floatSalary = {4500000f, 4000000f, 5000000f};
        Double[] doubleSalary = {6000000.5, 5000000.5, 7000000.5};

        Employee<Integer> e1 = new Employee<>(1, "Hien", intSalary);
        Employee<Float> e2 = new Employee<>(2, "Hieu", floatSalary);
        Employee<Double> e3 = new Employee<>(3, "Huong", doubleSalary);

        e1.printInfo();
        e1.printSalaryOfLastMonth();
        e2.printInfo();
        e2.printSalaryOfLastMonth();
        e3.printInfo();
        e3.printSalaryOfLastMonth();
    }
}
