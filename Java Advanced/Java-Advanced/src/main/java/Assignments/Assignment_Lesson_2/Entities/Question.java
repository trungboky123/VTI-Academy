package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "Question_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @ManyToOne
    @JoinColumn(name = "Category_ID", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "Type_ID", nullable = false)
    private TypeQuestion type;

    @ManyToOne
    @JoinColumn(name = "Creator_ID", nullable = false)
    private Account creator;

    @Column(name = "Create_Date", nullable = false)
    private LocalDate createDate;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers = new ArrayList<>();

    @ManyToMany(mappedBy = "questions")
    private List<Exam> exams = new ArrayList<>();

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
