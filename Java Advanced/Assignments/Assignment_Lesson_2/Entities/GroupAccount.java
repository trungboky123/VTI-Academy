package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "group_account")
public class GroupAccount {
    @EmbeddedId
    private GroupAccountId id;

    @ManyToOne
    @MapsId("groupId")
    @JoinColumn(name = "Group_ID")
    private Group group;

    @ManyToOne
    @MapsId("accountId")
    @JoinColumn(name = "Account_ID")
    private Account account;

    @Column(name = "Join_Date", nullable = false)
    private LocalDate joinDate;

    public GroupAccountId getId() {
        return id;
    }

    public void setId(GroupAccountId id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
