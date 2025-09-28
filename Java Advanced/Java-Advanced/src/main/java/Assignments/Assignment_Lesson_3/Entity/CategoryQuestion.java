package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoryquestion")
public class CategoryQuestion {
    @Id
    @Column(name = "CategoryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CategoryName", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Question> questions;

    @OneToMany(mappedBy = "category")
    private List<Exam> exams;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
