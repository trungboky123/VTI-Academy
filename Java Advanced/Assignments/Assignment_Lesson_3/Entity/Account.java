package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "AccountID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Email", nullable = false, unique = true, updatable = false, length = 50)
    private String email;

    @Column(name = "Username", nullable = false, unique = true, updatable = false, length = 50)
    private String username;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 50)
    private String lastName;

    @Transient
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @ManyToOne
    @JoinColumn(name = "DepartmentID", nullable = false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "PositionID", nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "SalaryID", nullable = false)
    private Salary salary;

    @Column(name = "CreateDate", nullable = false, updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "creator")
    private List<Group> groups;

    @OneToMany(mappedBy = "account")
    private List<GroupAccount> groupAccounts;

    @OneToOne(mappedBy = "creator")
    private Question question;

    @OneToMany(mappedBy = "creator")
    private List<Exam> exams;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<GroupAccount> getGroupAccounts() {
        return groupAccounts;
    }

    public void setGroupAccounts(List<GroupAccount> groupAccounts) {
        this.groupAccounts = groupAccounts;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
