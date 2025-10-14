package Assignments.Assignment_Lesson_9.Repository;

import Assignments.Assignment_Lesson_9.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    Department findByName(String name);
}
