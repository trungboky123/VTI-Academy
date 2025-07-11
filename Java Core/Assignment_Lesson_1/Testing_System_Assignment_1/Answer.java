public class Answer {
    int id;
    String content;
    Question question;
    boolean isCorrect;

    public Answer(int id, String content, Question question, boolean isCorrect){
        this.id = id;
        this.content = content;
        this.question = question;
        this.isCorrect = isCorrect;
    }
}
