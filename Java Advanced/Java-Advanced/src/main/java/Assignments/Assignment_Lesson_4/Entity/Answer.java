package Assignments.Assignment_Lesson_4.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @Column(name = "answer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "content", nullable = false, unique = true, length = 100)
    private String content;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    @Column(name = "is_correct")
    private boolean isCorrect;

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

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }
}
