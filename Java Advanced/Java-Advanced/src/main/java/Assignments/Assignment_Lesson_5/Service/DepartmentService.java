package Assignments.Assignment_Lesson_5.Service;

import Assignments.Assignment_Lesson_5.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_5.Entity.Department;
import Assignments.Assignment_Lesson_5.Mapper.DepartmentMapper;
import Assignments.Assignment_Lesson_5.Repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public DepartmentDTO create(DepartmentDTO departmentDTO) {
        Department department = DepartmentMapper.createDepartment(departmentDTO.getName());
        Department saved = departmentRepository.create(department);
        return new DepartmentDTO(saved.getId(), saved.getName());
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<Department> departments = departmentRepository.getAllDepartments();
        return departments.stream().map(d -> new DepartmentDTO(d.getId(), d.getName())).toList();
    }

    @Override
    public DepartmentDTO updateDepartment(int id, String newName) {
        Department department = departmentRepository.updateDepartment(id, newName);
        return new DepartmentDTO(department.getId(), department.getName());
    }
}
