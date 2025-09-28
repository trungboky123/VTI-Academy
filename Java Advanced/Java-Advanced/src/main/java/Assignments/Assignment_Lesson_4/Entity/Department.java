package Assignments.Assignment_Lesson_4.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "department_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name", nullable = false, unique = true, length = 30)
    private String name;

    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER)
    private List<Account> accounts;

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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
