package Assignment_Lesson_6.Exercise2.Question5;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SmartPhone extends Phone implements Weapon{
    @Override
    public void answer(){
        System.out.println("Smart phone is answering...");
    }

    @Override
    public void call(){
        System.out.println("Smart phone is calling...");
    }

    @Override
    public void sendMessages(){
        System.out.println("Smart phone is sending messages...");
    }

    @Override
    public void receiveMessages(){
        System.out.println("Smart phone is receiving messages...");
    }

    @Override
    public void attackEnemy(){
        System.out.println("Smart phone is used for attacking enemies...");
    }

    public void use3G(){
        System.out.println("Smart phone is using 3G...");
    }

    public void photographing(){
        System.out.println("Smart phone is taking photos...");
    }
}
