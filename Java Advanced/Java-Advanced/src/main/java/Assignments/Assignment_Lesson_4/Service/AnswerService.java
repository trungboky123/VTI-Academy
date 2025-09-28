package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Answer;
import Assignments.Assignment_Lesson_4.Repository.AnswerRepository;
import Assignments.Assignment_Lesson_4.Repository.IAnswerRepository;

public class AnswerService implements IAnswerService{
    private final IAnswerRepository answerRepository;

    public AnswerService() {
        answerRepository = new AnswerRepository();
    }

    @Override
    public void create(Answer answer) {
        answerRepository.create(answer);
    }
}
