package Assignments.Assignment_Lesson_3.Service.Department;

import Assignments.Assignment_Lesson_3.Entity.Department;

public interface IDepartmentService {
    void create(String name);
    Department getDepartmentByName(String name);
}
