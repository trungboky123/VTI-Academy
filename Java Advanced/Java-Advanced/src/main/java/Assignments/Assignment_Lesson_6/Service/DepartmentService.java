package Assignments.Assignment_Lesson_6.Service;

import Assignments.Assignment_Lesson_6.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_6.Entity.Department;
import Assignments.Assignment_Lesson_6.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Page<DepartmentDTO> getAllDepartments(String search, Integer minMember, Integer maxMember, int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Specification<Department> specification = (root, query, criteriaBuilder) -> null;

        if (search != null && !search.isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("name"), "%" + search + "%"));
        }

        if (minMember != null) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("totalMember"), minMember));

        }

        if (maxMember != null) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.lessThanOrEqualTo(root.get("totalMember"), maxMember));

        }

        Page<Department> departments = departmentRepository.findAll(specification, pageable);
        return departments.map(d -> new DepartmentDTO(d.getId(), d.getTotalMember(), d.getName()));
    }
}
