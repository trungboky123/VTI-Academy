package Assignments.Assignment_Lesson_6.Exercise2.Question5;

public class ClassicPhone extends Phone implements Weapon{
    @Override
    public void answer(){
        System.out.println("Classic phone is answering...");
    }

    @Override
    public void call(){
        System.out.println("Classic phone is calling...");
    }

    @Override
    public void sendMessages(){
        System.out.println("Classic phone is sending messages...");
    }

    @Override
    public void receiveMessages(){
        System.out.println("Classic phone is receiving messages...");
    }

    @Override
    public void attackEnemy(){
        System.out.println("Classic phone is used for attacking enemies...");
    }

    public void listenToRadio(){
        System.out.println("Classic phone is listening to radio...");
    }
}
