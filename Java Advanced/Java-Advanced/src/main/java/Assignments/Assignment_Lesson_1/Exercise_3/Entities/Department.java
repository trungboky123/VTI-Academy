package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "Department_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;
    @Column(name = "Department_Name")
    private String deptName;

    public int getId() {
        return deptId;
    }

    public void setId(int deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return deptName;
    }

    public void setName(String deptName) {
        this.deptName = deptName;
    }
}
