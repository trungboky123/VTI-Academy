package Lessons.Lesson_4.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "question_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "content", nullable = false, unique = true, length = 100)
    private String content;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
