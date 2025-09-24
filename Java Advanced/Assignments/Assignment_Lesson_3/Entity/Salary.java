package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "salary")
public class Salary {
    @Id
    @Column(name = "SalaryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "SalaryName", nullable = false, unique = true)
    private SalaryEnum salaryName;

    @OneToMany(mappedBy = "salary")
    private List<Account> accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SalaryEnum getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(SalaryEnum salaryName) {
        this.salaryName = salaryName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
