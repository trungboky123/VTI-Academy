package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category_question")
public class Category {
    @Id
    @Column(name = "Category_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Category_Name", nullable = false, length = 30)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Exam> exams = new ArrayList<>();

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
