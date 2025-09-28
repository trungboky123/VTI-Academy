package Assignments.Assignment_Lesson_4.Mapper;

import Assignments.Assignment_Lesson_4.Entity.Answer;
import Assignments.Assignment_Lesson_4.Entity.Question;

public class AnswerMapper {
    public static Answer createAnswer(String content, Question question, boolean isCorrect) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setQuestion(question);
        answer.setIsCorrect(isCorrect);
        return answer;
    }
}
