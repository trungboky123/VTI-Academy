package Assignments.Assignment_Lesson_3.Repository.Department;

import Assignments.Assignment_Lesson_3.Entity.Department;

public interface IDepartmentRepository {
    void create(Department department);
    Department getDepartmentByName(String name);
}
