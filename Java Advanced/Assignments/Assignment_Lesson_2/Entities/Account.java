package Assignments.Assignment_Lesson_2.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "Account_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Email", nullable = false, length = 50)
    private String email;

    @Column(name = "Full_name", nullable = false, length = 30)
    private String fullName;

    @Column(name = "Username", nullable = false, length = 30)
    private String username;

    @ManyToOne
    @JoinColumn(name = "Department_ID", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "Position_ID", nullable = false)
    private Position position;

    @Column(name = "Create_Date", nullable = false)
    private LocalDate createDate;

    @OneToMany(mappedBy = "account")
    private List<GroupAccount> groupAccounts = new ArrayList<>();

    @OneToMany(mappedBy = "creator")
    private List<Question> questions = new ArrayList<>();

    @OneToMany(mappedBy = "creator")
    private List<Exam> exams = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<GroupAccount> getGroupAccounts() {
        return groupAccounts;
    }

    public void setGroupAccounts(List<GroupAccount> groupAccounts) {
        this.groupAccounts = groupAccounts;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
