package Assignments.Assignment_Lesson_7.Controller;

import Assignments.Assignment_Lesson_7.DTO.DepartmentDTO;
import Assignments.Assignment_Lesson_7.Entity.Department;
import Assignments.Assignment_Lesson_7.Service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {
    private final IDepartmentService departmentService;

    @Autowired
    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping(value = "/all")
    public Page<DepartmentDTO> getAllDepartments(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return departmentService.getAllDepartments(page, size, sortBy);
    }

    @GetMapping(value = "/{id}")
    public DepartmentDTO getDepartmentById(@PathVariable int id) {
        return departmentService.getDepartmentById(id);
    }

    @GetMapping
    public DepartmentDTO getDepartmentByName(@RequestParam(required = false) String name) {
        if (name == null || name.isBlank()) {
            return null;
        }
        return departmentService.getDepartmentByName(name);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> createDepartment(@RequestBody Department department) {
        departmentService.createDepartment(department);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Department created successfully!");
        response.put("status code", "201");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<String> updateDepartment(
            @PathVariable int id,
            @RequestParam String newName
    ) {
        departmentService.updateDepartment(id, newName);
        return ResponseEntity.ok("Update department successfully!");
    }

    @PutMapping
    public ResponseEntity<String> updateDepartment(
            @RequestBody Department department
    ) {
        departmentService.updateDepartment(department);
        return ResponseEntity.ok("Update department successfully!");
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable int id) {
        departmentService.deleteDepartment(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/check/{id}")
    public ResponseEntity<String> doesDepartmentExistById(@PathVariable int id) {
        if (departmentService.doesDepartmentExistById(id)) {
            return ResponseEntity.ok("Department existed!");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/check")
    public ResponseEntity<String> doesDepartmentExistByName(@RequestParam String name) {
        if (departmentService.doesDepartmentExistByName(name)) {
            return ResponseEntity.ok("Department existed!");
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
}
