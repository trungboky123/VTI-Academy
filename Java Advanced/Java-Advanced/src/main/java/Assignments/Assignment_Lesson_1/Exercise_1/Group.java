package Assignments.Assignment_Lesson_1.Exercise_1;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "job_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Group_ID")
    private int id;
    @Column(name = "Group_Name")
    private String name;
    @Column(name = "Create_Date")
    private LocalDate createDate;

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
}
