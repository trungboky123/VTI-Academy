package Assignments.Assignment_Lesson_9.Repository;

import Assignments.Assignment_Lesson_9.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>, JpaSpecificationExecutor<Account> {
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
