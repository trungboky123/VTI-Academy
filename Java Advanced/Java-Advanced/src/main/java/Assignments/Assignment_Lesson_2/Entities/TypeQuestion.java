package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "type_question")
public class TypeQuestion {
    @Id
    @Column(name = "Type_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_Name", nullable = false)
    private TypeEnum name;

    @OneToMany(mappedBy = "type")
    private List<Question> questions = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEnum getName() {
        return name;
    }

    public void setName(TypeEnum name) {
        this.name = name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
