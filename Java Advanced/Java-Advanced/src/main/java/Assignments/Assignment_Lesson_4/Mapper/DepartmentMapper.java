package Assignments.Assignment_Lesson_4.Mapper;

import Assignments.Assignment_Lesson_4.Entity.Department;

public class DepartmentMapper {
    public static Department createDepartment(String name) {
        Department department = new Department();
        department.setName(name);
        return department;
    }
}
