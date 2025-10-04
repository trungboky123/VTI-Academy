package Assignments.Assignment_Lesson_7.Entity;

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
        if (!(o instanceof GroupAccountId that)) {
            return false;
        }
        return groupId == that.groupId && accountId == that.accountId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, accountId);
    }
}
