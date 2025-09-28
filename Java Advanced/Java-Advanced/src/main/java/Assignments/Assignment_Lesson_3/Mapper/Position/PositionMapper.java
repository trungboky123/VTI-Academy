package Assignments.Assignment_Lesson_3.Mapper.Position;

import Assignments.Assignment_Lesson_3.Entity.Position;
import Assignments.Assignment_Lesson_3.Entity.PositionEnum;

public class PositionMapper {
    public static Position create(String name) {
        Position position = new Position();
        position.setPositionName(PositionEnum.valueOf(name));
        return position;
    }
}
