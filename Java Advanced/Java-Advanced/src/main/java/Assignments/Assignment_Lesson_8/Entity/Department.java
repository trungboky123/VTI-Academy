package Assignments.Assignment_Lesson_8.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "department")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Integer id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String name;

    @Column(name = "total_member", nullable = false)
    private Integer totalMember;

    @OneToMany(mappedBy = "department")
    private List<Account> accounts;
}
