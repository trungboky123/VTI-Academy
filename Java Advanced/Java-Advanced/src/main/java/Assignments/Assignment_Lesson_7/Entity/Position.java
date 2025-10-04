package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "position")
@Data
public class Position {
    @Id
    @Column(name = "position_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "position_name", nullable = false, unique = true)
    private PositionEnum positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;
}
