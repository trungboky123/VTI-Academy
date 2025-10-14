package Lessons.Lesson_6;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "total_member")
    private Integer totalMember;

    @Column(name = "department_name", nullable = false, unique = true, length = 30)
    private String name;
}
