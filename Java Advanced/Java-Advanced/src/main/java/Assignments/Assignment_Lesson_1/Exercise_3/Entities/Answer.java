package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Answer_ID")
    private int answerId;
    @Column(name = "Content", nullable = false, length = 500)
    private String content;
    @ManyToOne
    @JoinColumn(name = "Question_ID")
    private Question question;
    @Column(name = "isCorrect")
    private boolean isCorrect;

    public int getId() {
        return answerId;
    }

    public void setId(int answerId) {
        this.answerId = answerId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}
