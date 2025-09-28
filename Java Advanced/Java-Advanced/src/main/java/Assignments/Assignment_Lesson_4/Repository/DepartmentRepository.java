package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Department;
import Assignments.Assignment_Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class DepartmentRepository implements IDepartmentRepository{
    @Override
    public void create(Department department) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(department);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
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

    @Override
    public BigDecimal sumOfSalaryOfDepartment(String name) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT sum(a.salary) FROM Account a WHERE a.department.name = :name";
            BigDecimal totalSalary = session.createQuery(hql, BigDecimal.class).setParameter("name", name).uniqueResult();
            return totalSalary;
        }
    }
}
