package Assignments.Assignment_Lesson_1.Question1;

import java.time.LocalDate;

public class Group {
    public int id;
    public String name;
    public int creatorId;
    public LocalDate createDate;

    public Group(int id, String name, int creatorId, LocalDate createDate){
        this.id = id;
        this.name = name;
        this.creatorId = creatorId;
        this.createDate =createDate;
    }
}
