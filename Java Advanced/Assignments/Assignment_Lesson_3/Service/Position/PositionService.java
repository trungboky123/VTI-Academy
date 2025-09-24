package Assignments.Assignment_Lesson_3.Service.Position;

import Assignments.Assignment_Lesson_3.Entity.Position;
import Assignments.Assignment_Lesson_3.Mapper.Position.PositionMapper;
import Assignments.Assignment_Lesson_3.Repository.Position.IPositionRepository;
import Assignments.Assignment_Lesson_3.Repository.Position.PositionRepository;

import java.util.List;

public class PositionService implements IPositionService{
    private final IPositionRepository positionRepository;

    public PositionService() {
        positionRepository = new PositionRepository();
    }


    @Override
    public void create(String name) {
        Position position = PositionMapper.create(name);
        positionRepository.create(position);
    }

    @Override
    public List<Position> getAllPosition() {
        return positionRepository.getAllPosition();
    }
}
