package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "exam_question")
@Data
public class ExamQuestion {
    @EmbeddedId
    private ExamQuestionId id;

    @ManyToOne
    @MapsId("examId")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "question_id")
    private Question question;
}
