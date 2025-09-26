package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Department;
import java.math.BigDecimal;

public interface IDepartmentRepository {
    void create(Department department);
    Department getDepartmentByName(String name);
    BigDecimal sumOfSalaryOfDepartment(String name);
}
