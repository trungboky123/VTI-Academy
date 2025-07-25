package Assignment_Lesson_6.Exercise3.Question2;

public class Car {
    protected String name;
    protected String type;

    public Car(String name, String type){
        this.name = name;
        this.type = type;
    }

    public class Engine{
        protected String engineType;

        public Engine(String engineType){
            this.engineType = engineType;
        }

        public String getEngineType(){
            return this.engineType;
        }

        public void setEngineType(String engineType){
            this.engineType = engineType;
        }
    }
}
