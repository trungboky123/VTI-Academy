package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @Column(name = "Exam_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Code", nullable = false, unique = true, length = 30)
    private String code;

    @Column(name = "Title", nullable = false, length = 30)
    private String title;

    @ManyToOne
    @JoinColumn(name = "Category_ID", nullable = false)
    private Category category;

    @Column(name = "Duration", nullable = false)
    private int duration;

    @ManyToOne
    @JoinColumn(name = "Creator_ID", nullable = false)
    private Account creator;

    @Column(name = "Create_Date", nullable = false)
    private LocalDate createDate;

    @ManyToMany
    @JoinTable(
            name = "exam_question",
            joinColumns = @JoinColumn(name = "Exam_ID"),
            inverseJoinColumns = @JoinColumn(name = "Question_ID")
    )
    private List<Question> questions = new ArrayList<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
