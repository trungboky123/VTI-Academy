package Lessons.Lesson_6;

import org.springframework.data.domain.Page;
import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDepartments();
    Department findByName(String name);
    Page<Department> getDepartments(int page, int size, String sortBy);
}
