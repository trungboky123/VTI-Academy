package TesingExam.Entity;

public class Employee extends User{
    public String proSkill;

    public Employee(String fullName, String email, String password, String proSkill){
        super(fullName, email, password, "Employee");
        this.proSkill = proSkill;
    }


}
