package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "groupaccount")
public class GroupAccount {
    @EmbeddedId
    private GroupAccountId id;

    @ManyToOne
    @MapsId("groupId")
    @JoinColumn(name = "GroupID")
    private Group group;

    @ManyToOne
    @MapsId("accountId")
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "JoinDate", nullable = false)
    private LocalDateTime joinDate = LocalDateTime.now();

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

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }
}
