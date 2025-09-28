package Assignments.Assignment_Lesson_3.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GroupAccountId implements Serializable {
    private int groupId;
    private int accountId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Assignments.Assignment_Lesson_2.Entities.GroupAccountId)) {
            return false;
        }
        GroupAccountId that = (GroupAccountId) o;
        return groupId == that.groupId && accountId == that.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, accountId);
    }
}
