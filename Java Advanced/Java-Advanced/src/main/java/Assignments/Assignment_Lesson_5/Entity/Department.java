package Assignments.Assignment_Lesson_5.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "DepartmentID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DepartmentName", nullable = false, unique = true, length = 30)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
