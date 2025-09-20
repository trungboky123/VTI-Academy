package Assignments.Assignment_Lesson_1.Exercise_3.Demo;

import Assignments.Assignment_Lesson_1.Exercise_3.Entities.Department;
import Assignments.Assignment_Lesson_1.Exercise_3.Utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class Read {
    public static void main(String[] args) {
        List<Department> departments;
        try(Session session = HibernateUtils.getsessionFactory().openSession()) {
            String hql = "FROM Department";
            departments = session.createQuery(hql, Department.class).list();
        }
        for (Department department : departments){
            System.out.println("ID: " + department.getId() + ", Name: " + department.getName());
        }
    }
}
