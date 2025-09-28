package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Mapper.DepartmentMapper;
import Assignments.Assignment_Lesson_4.Service.DepartmentService;
import Assignments.Assignment_Lesson_4.Service.IDepartmentService;
import java.util.Scanner;

public class CreateDepartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IDepartmentService departmentService = new DepartmentService();
        System.out.println("Enter department name: ");
        String name = scanner.nextLine();
        Department department = DepartmentMapper.createDepartment(name);
        departmentService.create(department);
    }
}
