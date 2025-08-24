package TesingExam.Entity;

public class Admin extends User{
    public int expInYear;

    public Admin(String fullName, String email, String password, int expInYear){
        super(fullName, email, password, "Admin");
        this.expInYear = expInYear;
    }
}
