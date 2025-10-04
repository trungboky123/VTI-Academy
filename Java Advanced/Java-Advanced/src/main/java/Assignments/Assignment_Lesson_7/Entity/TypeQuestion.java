package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "type_question")
@Data
public class TypeQuestion {
    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_name", nullable = false, unique = true)
    private TypeEnum typeName;

    @OneToMany(mappedBy = "type")
    private List<Question> questions;
}
