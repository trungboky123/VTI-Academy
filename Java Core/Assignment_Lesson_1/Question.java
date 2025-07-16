import java.time.LocalDate;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    int creatorId;
    LocalDate createDate;

    public Question(int id, String content, CategoryQuestion category, TypeQuestion type, int creatorId, LocalDate createDate){
        this.id = id;
        this.content = content;
        this.category = category;
        this.type = type;
        this.creatorId = creatorId;
        this.createDate = createDate;
    }
}
