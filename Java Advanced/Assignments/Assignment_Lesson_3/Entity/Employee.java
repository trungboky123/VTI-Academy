package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "AccountID")
    private int accountId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "WorkingNumberOfYear", nullable = false)
    private int workingNumberOfYear;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getWorkingNumberOfYear() {
        return workingNumberOfYear;
    }

    public void setWorkingNumberOfYear(int workingNumberOfYear) {
        this.workingNumberOfYear = workingNumberOfYear;
    }
}
