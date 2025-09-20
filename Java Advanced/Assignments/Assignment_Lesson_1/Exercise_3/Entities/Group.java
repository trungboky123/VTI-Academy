package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "job_group")
public class Group {
    @Id
    @Column(name = "Group_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    @Column(name = "Group_Name")
    private String groupName;
    @Column(name = "Create_Date")
    private LocalDate createDate;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
