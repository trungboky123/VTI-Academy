package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "QuestionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Content", nullable = false, length = 100)
    private String content;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion category;

    @ManyToOne
    @JoinColumn(name = "TypeID", nullable = false)
    private TypeQuestion type;

    @OneToOne
    @JoinColumn(name = "CreatorID", nullable = false, unique = true, updatable = false)
    private Account creator;

    @Column(name = "CreateDate", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @OneToMany(mappedBy = "question")
    private List<ExamQuestion> examQuestions;

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

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public TypeQuestion getType() {
        return type;
    }

    public void setType(TypeQuestion type) {
        this.type = type;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }
}
