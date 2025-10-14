package Assignments.Assignment_Lesson_5.Repository;

import Assignments.Assignment_Lesson_5.Entity.Department;
import Assignments.Assignment_Lesson_5.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DepartmentRepository implements IDepartmentRepository{
    @Override
    public Department create(Department department) {
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
        return department;
    }

    @Override
    public List<Department> getAllDepartments() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Department";
            return session.createQuery(hql, Department.class).getResultList();
        }
    }

    @Override
    public Department updateDepartment(int id, String newName) {
        Department department = new Department();
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "UPDATE Department d set d.name = :name WHERE d.id = :id";
            int rows = session.createQuery(hql).setParameter("name", newName).setParameter("id", id).executeUpdate();
            if (rows > 0) {
                department = session.get(Department.class, id);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return department;
    }
}
