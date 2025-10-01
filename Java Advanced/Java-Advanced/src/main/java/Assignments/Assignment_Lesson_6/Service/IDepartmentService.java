package Assignments.Assignment_Lesson_6.Service;

import Assignments.Assignment_Lesson_6.DTO.DepartmentDTO;
import org.springframework.data.domain.Page;

public interface IDepartmentService {
    Page<DepartmentDTO> getAllDepartments(String search, Integer minMember, Integer maxMember, int page, int size, String sortBy);
}
