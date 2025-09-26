package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Service.DepartmentService;
import Assignments.Assignment_Lesson_4.Service.IDepartmentService;

public class GetDepartmentByName {
    public static Department get(String name) {
        IDepartmentService departmentService = new DepartmentService();
        Department department = departmentService.getDepartmentByName(name);
        return department;
    }
}
