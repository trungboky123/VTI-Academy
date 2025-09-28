package Assignments.Assignment_Lesson_5.Service;

import Assignments.Assignment_Lesson_5.DTO.DepartmentDTO;

import java.util.List;

public interface IDepartmentService {
    DepartmentDTO create(DepartmentDTO departmentDTO);
    List<DepartmentDTO> getAllDepartments();
}
