package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @Column(name = "Question_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @Column(name = "Content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "Category_ID")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "Type_ID")
    private TypeQuestion typeQuestion;
    @ManyToOne
    @JoinColumn(name = "Creator_ID")
    private Account creator;
    @Column(name = "Create_Date")
    private LocalDate createDate;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public TypeQuestion getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(TypeQuestion typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
