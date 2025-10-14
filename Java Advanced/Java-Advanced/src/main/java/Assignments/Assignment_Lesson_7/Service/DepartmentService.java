package Assignments.Assignment_Lesson_7.Service;

import Assignments.Assignment_Lesson_7.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_7.Entity.Department;
import Assignments.Assignment_Lesson_7.Repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService{
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Page<DepartmentDTO> getAllDepartments(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Department> departments = departmentRepository.findAll(pageable);
        return departments.map(d -> new DepartmentDTO(d.getId(), d.getName()));
    }

    @Override
    public DepartmentDTO getDepartmentById(int id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department with id " + id + " not found"));
        return new DepartmentDTO(department.getId(), department.getName());
    }

    @Override
    public DepartmentDTO getDepartmentByName(String name) {
        Department department = departmentRepository.findByName(name);
        if (department == null) {
            return null;
        }
        return new DepartmentDTO(department.getId(), department.getName());
    }

    @Override
    public void createDepartment(Department department) {
        if (departmentRepository.existsByName(department.getName())) {
            throw new RuntimeException("Department already exist!");
        }
        departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(int id, String newName) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department with id " + id + " not found!"));
        department.setName(newName);
        departmentRepository.save(department);
    }

    @Override
    public void updateDepartment(Department department) {
        Department existDepartment = departmentRepository.findById(department.getId()).orElseThrow(() -> new RuntimeException("Department not found!"));
        existDepartment.setName(department.getName());
        departmentRepository.save(existDepartment);
    }

    @Override
    public void deleteDepartment(int id) {
        Department department = departmentRepository.findById(id).orElseThrow(() -> new RuntimeException("Department with id " + id + " not found!"));
        departmentRepository.delete(department);
    }

    @Override
    public boolean doesDepartmentExistById(int id) {
        return departmentRepository.existsById(id);
    }

    @Override
    public boolean doesDepartmentExistByName(String name) {
        return departmentRepository.existsByName(name);
    }
}
