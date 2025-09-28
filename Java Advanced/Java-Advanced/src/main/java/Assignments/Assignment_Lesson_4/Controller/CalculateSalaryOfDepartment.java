package Assignments.Assignment_Lesson_4.Controller;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Service.DepartmentService;
import Assignments.Assignment_Lesson_4.Service.IDepartmentService;
import Assignments.Assignment_Lesson_4.Utils.GetDepartmentByName;
import java.math.BigDecimal;
import java.util.Scanner;

public class CalculateSalaryOfDepartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IDepartmentService departmentService = new DepartmentService();
        String name;
        do {
            System.out.println("Enter department name you want to see the sum of salary: ");
            name = scanner.nextLine();
            Department department = GetDepartmentByName.get(name);
            if (department == null) {
                System.out.println("Department not found. Please enter again: ");
                continue;
            }
            break;
        } while (true);
        BigDecimal totalSalary = departmentService.sumOfSalaryOfDepartment(name);
        System.out.println("Total Salary: " + totalSalary);
    }
}
