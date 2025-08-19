package Assignments.Assignment_Lesson_1.Question1;

import java.time.LocalDate;

public class Question {
    public int id;
    public String content;
    public CategoryQuestion category;
    public TypeQuestion type;
    public int creatorId;
    public LocalDate createDate;

    public Question(int id, String content, CategoryQuestion category, TypeQuestion type, int creatorId, LocalDate createDate){
        this.id = id;
        this.content = content;
        this.category = category;
        this.type = type;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }
}
