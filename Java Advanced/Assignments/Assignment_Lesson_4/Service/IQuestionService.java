package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Question;
import java.util.List;

public interface IQuestionService {
    void create(Question question);
    List<Object[]> getQuestionsHavingMoreThan2CorrectAnswers();
}
