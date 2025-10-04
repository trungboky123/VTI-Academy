package Assignments.Assignment_Lesson_7.Repository;

import Assignments.Assignment_Lesson_7.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByName(String name);
    boolean existsByName(String name);
}
