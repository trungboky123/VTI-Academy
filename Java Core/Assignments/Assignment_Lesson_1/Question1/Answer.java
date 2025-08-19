package Assignments.Assignment_Lesson_1.Question1;

public class Answer {
    public int id;
    public String content;
    public Question question;
    public boolean isCorrect;

    public Answer(int id, String content, Question question, boolean isCorrect){
        this.id = id;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }
}
