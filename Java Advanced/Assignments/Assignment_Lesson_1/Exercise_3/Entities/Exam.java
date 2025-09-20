package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @Column(name = "Exam_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examId;
    @Column(name = "Code")
    private String code;
    @Column(name = "Title")
    private String title;
    @ManyToOne
    @JoinColumn(name = "Category_ID")
    private Category category;
    @Column(name = "Duration")
    private int duration;
    @ManyToOne
    @JoinColumn(name = "Creator_ID")
    private Account creator;
    @Column(name = "Create_Date")
    private LocalDate createDate;

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
}
