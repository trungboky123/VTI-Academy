package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Question;
import Assignments.Assignment_Lesson_4.Repository.IQuestionRepository;
import Assignments.Assignment_Lesson_4.Repository.QuestionRepository;

import java.util.List;

public class QuestionService implements IQuestionService{
    private final IQuestionRepository questionRepository;

    public QuestionService() {
        questionRepository = new QuestionRepository();
    }

    @Override
    public void create(Question question) {
        questionRepository.create(question);
    }

    @Override
    public List<Object[]> getQuestionsHavingMoreThan2CorrectAnswers() {
        return questionRepository.getQuestionsHavingMoreThan2CorrectAnswers();
    }
}
