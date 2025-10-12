package Assignments.Assignment_Lesson_8.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Integer id;

    @Column(name = "username", unique = true, nullable = false, length = 30)
    private String username;

    @Column(name = "email", unique = true, nullable = false, length = 30)
    private String email;

    @Column(name = "full_name", nullable = false, length = 30)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @Column(name = "create_date")
    private LocalDate createDate = LocalDate.now();
}
