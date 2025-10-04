package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "salary")
@Data
public class Salary {
    @Id
    @Column(name = "salary_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "salary_name", nullable = false, unique = true)
    private SalaryEnum salaryName;

    @OneToMany(mappedBy = "salary")
    private List<Account> accounts;
}
