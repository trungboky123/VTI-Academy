package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "employee")
@Data
public class Employee {
    @Id
    @Column(name = "account_id")
    private int accountId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "working_number_of_year", nullable = false)
    private int workingNumberOfYear;
}
