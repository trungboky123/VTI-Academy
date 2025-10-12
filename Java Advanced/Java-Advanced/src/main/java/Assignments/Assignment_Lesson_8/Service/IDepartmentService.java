package Assignments.Assignment_Lesson_8.Service;

import Assignments.Assignment_Lesson_8.DTO.Response.DepartmentResponse;
import java.util.List;

public interface IDepartmentService {
    List<DepartmentResponse> getAllDepartments(String search, Integer minId, Integer maxId, Integer minMember, Integer maxMember);
}
