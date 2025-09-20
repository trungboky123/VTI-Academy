package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "job_position")
public class Position {
    @Id
    @Column(name = "Position_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int poId;
    @Column(name = "Position_Name")
    private String poName;

    public int getId() {
        return poId;
    }

    public void setId(int poId) {
        this.poId = poId;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }
}
