package Assignments.Review.Repository;

import Assignments.Review.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Account findByUsername(String username);
}
