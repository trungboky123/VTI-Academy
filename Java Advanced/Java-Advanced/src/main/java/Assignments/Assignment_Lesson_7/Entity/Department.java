package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "department")
@Data
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name", nullable = false, unique = true, length = 30)
    private String name;

    @OneToOne(mappedBy = "department", cascade = CascadeType.ALL)
    private DetailDepartment detailDepartment;
}
