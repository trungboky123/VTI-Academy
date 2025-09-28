package Assignments.Assignment_Lesson_1.Exercise_3.Demo;

import Assignments.Assignment_Lesson_1.Exercise_1.HibernateUtils;
import Assignments.Assignment_Lesson_1.Exercise_3.Entities.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Department department = session.get(Department.class, 2);
            if (department != null) {
                session.remove(department);
                System.out.println("Deleted department successfully!");
            }
            else {
                System.out.println("Cannot find department!");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
