package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "typequestion")
public class TypeQuestion {
    @Id
    @Column(name = "TypeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TypeName", nullable = false, unique = true)
    private TypeEnum typeName;

    @OneToMany(mappedBy = "type")
    private List<Question> questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEnum getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeEnum typeName) {
        this.typeName = typeName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
