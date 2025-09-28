package Assignments.Assignment_Lesson_5.Controller;

import Assignments.Assignment_Lesson_5.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_5.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @PostMapping
    public DepartmentDTO create(@RequestBody DepartmentDTO departmentDTO) {
        return departmentService.create(departmentDTO);
    }

    @GetMapping
    public List<DepartmentDTO> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
