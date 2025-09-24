package Assignments.Assignment_Lesson_3.Repository.Position;

import Assignments.Assignment_Lesson_3.Entity.Position;
import java.util.List;

public interface IPositionRepository {
    void create(Position position);
    List<Position> getAllPosition();
}
