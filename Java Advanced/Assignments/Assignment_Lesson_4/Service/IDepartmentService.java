package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Department;
import java.math.BigDecimal;

public interface IDepartmentService {
    void create(Department department);
    Department getDepartmentByName(String name);
    BigDecimal sumOfSalaryOfDepartment(String name);
}
