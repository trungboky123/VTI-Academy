package Assignments.Assignment_Lesson_3.Controller;

import Assignments.Assignment_Lesson_3.Entity.Department;
import Assignments.Assignment_Lesson_3.Entity.Position;
import Assignments.Assignment_Lesson_3.Service.Department.DepartmentService;
import Assignments.Assignment_Lesson_3.Service.Department.IDepartmentService;
import Assignments.Assignment_Lesson_3.Service.Position.IPositionService;
import Assignments.Assignment_Lesson_3.Service.Position.PositionService;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        IDepartmentService departmentService = new DepartmentService();
        departmentService.create("Chu tich");
        Department department = departmentService.getDepartmentByName("Chu tich");
        if (department != null) {
            System.out.println("ID: " + department.getId() + ", Name: " + department.getName());
        }
        else {
            System.out.println("Cannot find department!");
        }


        try {
            IPositionService positionService = new PositionService();
            positionService.create("PM");
            List<Position> positions = positionService.getAllPosition();
            for (Position p : positions) {
                System.out.println("ID: " + p.getId() + ", Name: " + p.getPositionName());
            }
        } catch (Exception e) {
            System.out.println("Invalid position name!");
        }
    }
}
