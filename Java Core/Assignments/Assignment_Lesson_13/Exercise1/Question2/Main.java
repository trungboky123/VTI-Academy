package Assignments.Assignment_Lesson_13.Exercise1.Question2;

import Assignments.Assignment_Lesson_1.Question1.Position;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        List<Position> positions = GetPosition.getPosition();
        for(Position p : positions){
            System.out.println("Position ID: " + p.id + ", Position Name: " + p.name);
        }
    }
}
