package Assignments.Assignment_Lesson_8.Controller;

import Assignments.Assignment_Lesson_8.DTO.Response.DepartmentResponse;
import Assignments.Assignment_Lesson_8.Service.IDepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/departments")
public class DepartmentController {
    private final IDepartmentService departmentService;

    @GetMapping
    public List<DepartmentResponse> getAllDepartments(
            @RequestParam(required = false) String search,
            @RequestParam(required = false) Integer minId,
            @RequestParam(required = false) Integer maxId,
            @RequestParam(required = false) Integer minMember,
            @RequestParam(required = false) Integer maxMember
    ) {
        return departmentService.getAllDepartments(search, minId, maxId, minMember, maxMember);
    }
}
