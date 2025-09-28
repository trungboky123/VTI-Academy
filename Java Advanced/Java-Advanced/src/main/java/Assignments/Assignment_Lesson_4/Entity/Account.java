package Assignments.Assignment_Lesson_4.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email", nullable = false, unique = true, length = 30)
    private String email;

    @Column(name = "full_name", nullable = false, length = 30)
    private String fullName;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(name = "salary", precision = 15, scale = 2)
    private BigDecimal salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
