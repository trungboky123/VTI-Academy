package Assignments.Assignment_Lesson_9.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "department")
@Data
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "department_name", nullable = false, unique = true, length = 30)
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;
}
