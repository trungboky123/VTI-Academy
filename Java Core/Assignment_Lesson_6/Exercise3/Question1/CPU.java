package Assignment_Lesson_6.Exercise3.Question1;

public class CPU {
    protected double price;

    public CPU(double price){
        this.price = price;
    }

    public class Processor{
        protected int coreAmount;
        protected String menuFacturer;

        public Processor(int coreAmount, String menuFacturer){
            this.coreAmount = coreAmount;
            this.menuFacturer = menuFacturer;
        }

        public double getCache(){
            return 4.3;
        }
    }

    public class Ram{
        protected int memory;
        protected String menuFacturer;

        public Ram(int memory, String menuFacturer){
            this.memory = memory;
            this.menuFacturer = menuFacturer;
        }

        public double getClockSpeed(){
            return 5.5;
        }
    }
}
