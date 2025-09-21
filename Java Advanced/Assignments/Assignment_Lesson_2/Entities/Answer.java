package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @Column(name = "Answer_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "Question_ID", nullable = false)
    private Question question;

    @Enumerated(EnumType.STRING)
    @Column(name = "isCorrect")
    private BooleanCorrect isCorrect;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public BooleanCorrect getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(BooleanCorrect isCorrect) {
        this.isCorrect = isCorrect;
    }
}
