package Assignments.Assignment_Lesson_4.Mapper;

import Assignments.Assignment_Lesson_4.Entity.Question;

public class QuestionMapper {
    public static Question createQuestion(String content) {
        Question question = new Question();
        question.setContent(content);
        return question;
    }
}
