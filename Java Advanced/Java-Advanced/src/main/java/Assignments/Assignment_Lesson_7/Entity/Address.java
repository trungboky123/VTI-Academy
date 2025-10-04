package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "address")
@Data
public class Address {
    @Id
    @Column(name = "address_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address_name", nullable = false, unique = true, length = 100)
    private String name;

    @OneToMany(mappedBy = "address")
    private List<DetailDepartment> detailDepartments;
}
