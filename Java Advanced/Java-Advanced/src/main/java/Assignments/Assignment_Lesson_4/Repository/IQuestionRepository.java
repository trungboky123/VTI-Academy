package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Question;

import java.util.List;

public interface IQuestionRepository {
    void create(Question question);
    List<Object[]> getQuestionsHavingMoreThan2CorrectAnswers();
}
