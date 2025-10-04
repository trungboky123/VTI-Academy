package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detail_department")
@Data
public class DetailDepartment {
    @Id
    @Column(name = "department_id")
    private int deptId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @Column(name = "emulation_point")
    private int emulationPoint;
}
