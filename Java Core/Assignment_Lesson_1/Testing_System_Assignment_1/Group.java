import java.time.LocalDate;

public class Group {
    int id;
    String name;
    int creatorId;
    LocalDate createDate;

    public Group(int id, String name, int creatorId, LocalDate createDate){
        this.id = id;
        this.name = name;
        this.creatorId = creatorId;
        this.createDate =createDate;
    }
}
