package Lessons.Lesson_4.Service;

import Lessons.Lesson_4.Entity.Question;
import Lessons.Lesson_4.Repository.IQuestionRepository;
import Lessons.Lesson_4.Repository.QuestionRepository;

public class QuestionService implements IQuestionService {
    private final IQuestionRepository questionRepository;

    public QuestionService() {
        questionRepository = new QuestionRepository();
    }

    @Override
    public void create(Question question) {
        questionRepository.create(question);
    }
}
