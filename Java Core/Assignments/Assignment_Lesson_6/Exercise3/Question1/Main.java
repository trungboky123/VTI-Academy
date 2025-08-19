package Assignments.Assignment_Lesson_6.Exercise3.Question1;

public class Main {
    public static void main(String[] args){
        CPU cpu = new CPU(3000000);
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        CPU.Ram ram = cpu.new Ram(32, "Hien dz");

        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }
}
