package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "AddressID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "AddressName", nullable = false, unique = true, length = 100)
    private String name;

    @OneToMany(mappedBy = "address")
    private List<DetailDepartment> departments = new ArrayList<>();

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

    public List<DetailDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DetailDepartment> departments) {
        this.departments = departments;
    }
}
