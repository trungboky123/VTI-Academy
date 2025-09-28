package Assignments.Assignment_Lesson_3.Mapper.Department;

import Assignments.Assignment_Lesson_3.Entity.Department;

public class DepartmentMapper {
    public static Department create(String name) {
        Department department = new Department();
        department.setName(name);
        return department;
    }
}
