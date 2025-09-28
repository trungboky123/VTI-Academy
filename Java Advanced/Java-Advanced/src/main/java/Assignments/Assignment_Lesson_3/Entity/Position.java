package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @Column(name = "PositionID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "PositionName", nullable = false, unique = true)
    private PositionEnum positionName;

    @OneToMany(mappedBy = "position")
    private List<Account> accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionEnum getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionEnum positionName) {
        this.positionName = positionName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
