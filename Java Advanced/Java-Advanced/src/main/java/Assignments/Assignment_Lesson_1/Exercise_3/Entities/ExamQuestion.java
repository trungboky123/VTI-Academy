package Assignments.Assignment_Lesson_1.Exercise_3.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ExamQuestion")
public class ExamQuestion {
    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "Exam_ID")
    private Exam exam;
    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "Question_ID")
    private Question question;

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
