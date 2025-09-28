package Assignments.Assignment_Lesson_5.Mapper;

import Assignments.Assignment_Lesson_5.Entity.Department;

public class DepartmentMapper {
    public static Department createDepartment(String name) {
        Department department = new Department();
        department.setName(name);
        return department;
    }
}
