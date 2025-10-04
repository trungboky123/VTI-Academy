package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "category_question")
@Data
public class CategoryQuestion {
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category_name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Question> questions;

    @OneToMany(mappedBy = "category")
    private List<Exam> exams;
}
