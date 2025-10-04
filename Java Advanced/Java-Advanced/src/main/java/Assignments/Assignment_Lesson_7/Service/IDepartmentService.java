package Assignments.Assignment_Lesson_7.Service;

import Assignments.Assignment_Lesson_7.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_7.Entity.Department;
import org.springframework.data.domain.Page;

public interface IDepartmentService {
    Page<DepartmentDTO> getAllDepartments(int page, int size, String sortBy);
    DepartmentDTO getDepartmentById(int id);
    DepartmentDTO getDepartmentByName(String name);
    void createDepartment(Department department);
    void updateDepartment(int id, String newName);
    void updateDepartment(Department department);
    void deleteDepartment(int id);
    boolean doesDepartmentExistById(int id);
    boolean doesDepartmentExistByName(String name);
}
