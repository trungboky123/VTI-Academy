package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "manager")
@Data
public class Manager {
    @Id
    @Column(name = "account_id")
    private int accountId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(name = "management_number_of_year", nullable = false)
    private int managementNumberOfYear;
}
