package Assignments.Assignment_Lesson_7.Entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExamQuestionId implements Serializable {
    private int examId;
    private int questionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExamQuestionId that)) {
            return false;
        }
        return examId == that.examId && questionId == that.questionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, questionId);
    }
}
