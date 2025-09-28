package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @Column(name = "ExamID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Code", nullable = false, length = 10)
    private String code;

    @Column(name = "Title", nullable = false, length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion category;

    @Column(name = "Duration", nullable = false)
    private int duration = 45;

    @ManyToOne
    @JoinColumn(name = "CreatorID", nullable = false, updatable = false)
    private Account creator;

    @Column(name = "CreateDate")
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "exam")
    private List<ExamQuestion> examQuestions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
        if (duration >= 180) {
            code = "L - 1";
        }
        else if (duration >= 90) {
            code = "M - 1";
        }
        else {
            code = "S - 1";
        }
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

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }
}
