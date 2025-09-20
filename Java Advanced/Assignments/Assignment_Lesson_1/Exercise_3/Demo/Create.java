package Assignments.Assignment_Lesson_1.Exercise_3.Demo;

import Assignments.Assignment_Lesson_1.Exercise_3.Entities.Department;
import Assignments.Assignment_Lesson_1.Exercise_3.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Create {
    public static void main(String[] args) {
        Session session = null;
        Transaction transaction = null;
        try{
            session = HibernateUtils.getsessionFactory().openSession();
            transaction = session.beginTransaction();
            Department department = new Department();
            department.setName("Marketing");
            session.persist(department);
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        } finally {
            if (session != null){
                session.close();
            }
        }
    }
}
