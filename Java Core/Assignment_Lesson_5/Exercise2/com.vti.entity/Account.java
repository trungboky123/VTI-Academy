import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createDate;

    public Account(int id, String email, String username, String fullName, Department department, Position position, LocalDate createDate){
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
}
