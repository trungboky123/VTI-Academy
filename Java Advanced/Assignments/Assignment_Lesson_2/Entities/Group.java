package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "job_group")
public class Group {
    @Id
    @Column(name = "Group_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Group_Name", nullable = false, unique = true, length = 30)
    private String name;

    @Column(name = "Create_Date", nullable = false)
    private LocalDate createDate;

    @OneToMany(mappedBy = "group")
    private List<GroupAccount> groupAccounts = new ArrayList<>();

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

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<GroupAccount> getGroupAccounts() {
        return groupAccounts;
    }

    public void setGroupAccounts(List<GroupAccount> groupAccounts) {
        this.groupAccounts = groupAccounts;
    }
}
