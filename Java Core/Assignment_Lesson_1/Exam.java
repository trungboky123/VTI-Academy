import java.time.LocalDate;

public class Exam {
    int id;
    String code;
    String title;
    CategoryQuestion category;
    int duration;
    int creatorId;
    LocalDate createDate;

    public Exam(int id, String code, String title, CategoryQuestion category, int duration, int creatorId, LocalDate creatDate){
        this.id = id;
        this.code = code;
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.creatorId = creatorId;
        this. createDate = creatDate;
    }
}
