package Lessons.Lesson_4.Service;

import Lessons.Lesson_4.Entity.Answer;
import Lessons.Lesson_4.Repository.AnswerRepository;
import Lessons.Lesson_4.Repository.IAnswerRepository;

public class AnswerService implements IAnswerService {
    private final IAnswerRepository answerRepository;

    public AnswerService() {
        answerRepository = new AnswerRepository();
    }

    @Override
    public void create(Answer answer) {
        answerRepository.create(answer);
    }
}
