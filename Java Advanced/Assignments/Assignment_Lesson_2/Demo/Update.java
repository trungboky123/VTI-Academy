package Assignments.Assignment_Lesson_2.Demo;

import Assignments.Assignment_Lesson_2.Entities.Account;
import Assignments.Assignment_Lesson_2.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            String hql = "FROM Account WHERE fullName = :fullName";
            Account account = session.createQuery(hql, Account.class).setParameter("fullName", "Vu Quynh Huong").uniqueResult();
            if (account != null) {
                account.setUsername("quynhhuong123");
                System.out.println("Updated account successfully");
            }
            else {
                System.out.println("Cannot find account!");
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
