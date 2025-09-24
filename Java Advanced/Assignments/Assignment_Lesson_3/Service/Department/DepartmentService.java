package Assignments.Assignment_Lesson_3.Service.Department;

import Assignments.Assignment_Lesson_3.Entity.Department;
import Assignments.Assignment_Lesson_3.Mapper.Department.DepartmentMapper;
import Assignments.Assignment_Lesson_3.Repository.Department.DepartmentRepository;
import Assignments.Assignment_Lesson_3.Repository.Department.IDepartmentRepository;

public class DepartmentService implements IDepartmentService{
    private final IDepartmentRepository departmentRepository;

    public DepartmentService() {
        departmentRepository = new DepartmentRepository();
    }


    @Override
    public void create(String name) {
        Department department = DepartmentMapper.create(name);
        departmentRepository.create(department);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.getDepartmentByName(name);
    }
}
