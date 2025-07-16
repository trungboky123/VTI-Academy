package Sources;

import java.time.LocalDate;

public class Account {
    public int id;
    public String email;
    public String username;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDate createDate;

    public Account(int id, String email, String username, String fullName, Department department, Position position, LocalDate createDate){
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }
}
