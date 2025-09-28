package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Service.IQuestionService;
import Assignments.Assignment_Lesson_4.Service.QuestionService;
import java.util.List;

public class GetQuestionsWithNumberOfCorrectAnswersBiggerThan2 {
    public static void main(String[] args) {
        IQuestionService questionService = new QuestionService();
        List<Object[]> questions = questionService.getQuestionsHavingMoreThan2CorrectAnswers();
        if (questions.isEmpty()) {
            System.out.println("There are no questions having number of correct answers bigger than 2!");
        }
        else {
            for (Object[] q : questions) {
                System.out.println("ID: " + q[0] + ", Content: " + q[1] + ", Number of Correct Answers: " + q[2]);
            }
        }
    }
}
