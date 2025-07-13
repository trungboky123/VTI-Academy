package Sources;

import java.time.LocalDate;

public class Exam {
    public int id;
    public String code;
    public String title;
    public CategoryQuestion category;
    public int duration;
    public int creatorId;
    public LocalDate createDate;

    public Exam(int id, String code, String title, CategoryQuestion category, int duration, int creatorId, LocalDate createDate){
        this.id = id;
        this.code = code;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }
}
