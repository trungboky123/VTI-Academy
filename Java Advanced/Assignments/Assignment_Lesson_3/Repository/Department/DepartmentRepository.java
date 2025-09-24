package Assignments.Assignment_Lesson_3.Repository.Department;

import Assignments.Assignment_Lesson_3.Entity.Department;
import Assignments.Assignment_Lesson_3.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentRepository implements IDepartmentRepository{

    @Override
    public void create(Department department) {
        Transaction transaction;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(department);
            transaction.commit();
        }
    }

    @Override
    public Department getDepartmentByName(String name) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Department d WHERE d.name = :name";
            Department department = session.createQuery(hql, Department.class).setParameter("name", name).uniqueResult();
            return department;
        }
    }
}
