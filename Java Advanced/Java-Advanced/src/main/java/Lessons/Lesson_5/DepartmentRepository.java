package Lessons.Lesson_5;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository implements IDepartmentRepository{
    @Override
    public List<Department> getDepartment() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Department";
            return session.createQuery(hql, Department.class).getResultList();
        }
    }
}
