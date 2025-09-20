package Assignments.Assignment_Lesson_1.Exercise_3.Demo;

import Assignments.Assignment_Lesson_1.Exercise_3.Entities.Department;
import Assignments.Assignment_Lesson_1.Exercise_3.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getsessionFactory().openSession()){
            transaction = session.beginTransaction();
            Department department = session.get(Department.class, 2);
            if (department != null){
                department.setName("Consulting");
                System.out.println("Updated department successfully!");
            }
            else {
                System.out.println("Cannot find department!");
            }
            transaction.commit();
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
        }
    }
}
