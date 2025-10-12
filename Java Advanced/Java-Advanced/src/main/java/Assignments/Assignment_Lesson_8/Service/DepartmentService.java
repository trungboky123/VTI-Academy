package Assignments.Assignment_Lesson_8.Service;

import Assignments.Assignment_Lesson_8.DTO.Response.DepartmentResponse;
import Assignments.Assignment_Lesson_8.Entity.Department;
import Assignments.Assignment_Lesson_8.Repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService implements IDepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentResponse> getAllDepartments(String search, Integer minId, Integer maxId, Integer minMember, Integer maxMember) {
        Specification<Department> specification = (root, query, criteriaBuilder) -> null;

        if (search != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.like(criteriaBuilder.lower(root.get("name")), "%" + search.toLowerCase() + "%"));
        }

        if (minId != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.greaterThanOrEqualTo(root.get("id"), minId));
        }

        if (maxId != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.lessThanOrEqualTo(root.get("id"), maxId));
        }

        if (minMember != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.greaterThanOrEqualTo(root.get("totalMember"), minMember));
        }

        if (maxMember != null) {
            specification = specification.and((root, query, criteriaBuilder) ->
                    criteriaBuilder.lessThanOrEqualTo(root.get("totalMember"), maxMember));
        }

        return departmentRepository.findAll(specification).stream().map(d -> new DepartmentResponse(d.getId(), d.getName())).toList();
    }
}
