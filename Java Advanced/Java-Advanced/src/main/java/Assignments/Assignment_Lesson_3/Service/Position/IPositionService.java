package Assignments.Assignment_Lesson_3.Service.Position;

import Assignments.Assignment_Lesson_3.Entity.Position;

import java.util.List;

public interface IPositionService {
    void create(String name);
    List<Position> getAllPosition();
}
