package Assignments.Assignment_Lesson_9.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "account")
@Data
public class Account {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Transient
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;
}
