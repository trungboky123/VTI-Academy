package Assignments.Assignment_Lesson_5.Repository;

import Assignments.Assignment_Lesson_5.Entity.Department;

import java.util.List;

public interface IDepartmentRepository {
    Department create(Department department);
    List<Department> getAllDepartments();
}
