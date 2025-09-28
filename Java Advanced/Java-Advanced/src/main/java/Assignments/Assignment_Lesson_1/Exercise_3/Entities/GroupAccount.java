package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "group_account")
public class GroupAccount {
    @ManyToOne
    @MapsId("groupId")
    @JoinColumn(name = "Group_ID")
    private Group group;
    @ManyToOne
    @MapsId("accountId")
    @JoinColumn(name = "Account_ID")
    private Account account;
    @Column(name = "Join_Date")
    private LocalDate joinDate;
}
