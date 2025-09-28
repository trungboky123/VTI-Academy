package Assignments.Assignment_Lesson_4.Service;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Repository.DepartmentRepository;
import Assignments.Assignment_Lesson_4.Repository.IDepartmentRepository;

import java.math.BigDecimal;

public class DepartmentService implements IDepartmentService{
    private final IDepartmentRepository departmentRepository;

    public DepartmentService() {
        departmentRepository = new DepartmentRepository();
    }

    @Override
    public void create(Department department) {
        departmentRepository.create(department);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.getDepartmentByName(name);
    }

    @Override
    public BigDecimal sumOfSalaryOfDepartment(String name) {
        return departmentRepository.sumOfSalaryOfDepartment(name);
    }
}
