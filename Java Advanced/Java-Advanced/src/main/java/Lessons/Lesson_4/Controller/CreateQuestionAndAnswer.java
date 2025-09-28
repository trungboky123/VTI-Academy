package Lessons.Lesson_4.Controller;

import Lessons.Lesson_4.Entity.Answer;
import Lessons.Lesson_4.Entity.Question;
import Lessons.Lesson_4.Mapper.AnswerMapper;
import Lessons.Lesson_4.Mapper.QuestionMapper;
import Lessons.Lesson_4.Service.AnswerService;
import Lessons.Lesson_4.Service.IAnswerService;
import Lessons.Lesson_4.Service.IQuestionService;
import Lessons.Lesson_4.Service.QuestionService;

import java.util.Scanner;

public class CreateQuestionAndAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IQuestionService questionService = new QuestionService();
        IAnswerService answerService = new AnswerService();
        System.out.println("Enter content of question you want to add (<100 letters): ");
        String content = scanner.nextLine();
        Question question = QuestionMapper.createQuestion(content);
        questionService.create(question);
        System.out.println("Enter number of answer you want to add for this question: ");
        int numberOfAnswer = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfAnswer; i++) {
            System.out.println("Answer " + (i + 1));
            System.out.println("Enter content of answer (< 100 letters): ");
            String answerContent = scanner.nextLine();
            System.out.println("Is Correct? (true/false): ");
            boolean isCorrect = scanner.nextBoolean();
            scanner.nextLine();
            Answer answer = AnswerMapper.createAnswer(answerContent, question, isCorrect);
            answerService.create(answer);
        }
    }
}
