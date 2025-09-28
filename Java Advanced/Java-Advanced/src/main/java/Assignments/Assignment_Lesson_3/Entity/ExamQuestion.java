package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "examquestion")
public class ExamQuestion {
    @EmbeddedId
    private ExamQuestionId id;

    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "ExamID")
    private Exam exam;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "QuestionID")
    private Question question;

    public ExamQuestionId getId() {
        return id;
    }

    public void setId(ExamQuestionId id) {
        this.id = id;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
