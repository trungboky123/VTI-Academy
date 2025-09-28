package Lessons.Lesson_4.Mapper;

import Lessons.Lesson_4.Entity.Question;

public class QuestionMapper {
    public static Question createQuestion(String content) {
        Question question = new Question();
        question.setContent(content);
        return question;
    }
}
