package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exam")
@Data
public class Exam {
    @Id
    @Column(name = "exam_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code", nullable = false, length = 10)
    private String code;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryQuestion category;

    @Column(name = "duration", nullable = false)
    private int duration = 45;

    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false, updatable = false)
    private Account creator;

    @Column(name = "create_date")
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "exam")
    private List<ExamQuestion> examQuestions;
}
