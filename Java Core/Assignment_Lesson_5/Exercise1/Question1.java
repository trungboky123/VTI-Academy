package Assignment_Lesson_5.Exercise1;

public class Question1 {
    public  static class Department {
        int id;
        String name;

        public Department(){

        }

        public Department(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Department d1 = new Department();
        Department d2 = new Department("Sales");

        System.out.println(d1.id);
        System.out.println(d2.name);
    }
}
