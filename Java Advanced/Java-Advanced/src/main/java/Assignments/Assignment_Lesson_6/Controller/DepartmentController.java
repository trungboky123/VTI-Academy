package Assignments.Assignment_Lesson_6.Controller;

import Assignments.Assignment_Lesson_6.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_6.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public Page<DepartmentDTO> getAllDepartments(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) Integer minMember,
            @RequestParam(required = false) Integer maxMember,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return departmentService.getAllDepartments(search, minMember, maxMember, page, size, sortBy);
    }
}
