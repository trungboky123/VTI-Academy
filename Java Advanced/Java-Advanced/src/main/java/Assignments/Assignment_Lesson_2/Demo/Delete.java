package Assignments.Assignment_Lesson_2.Demo;

import Assignments.Assignment_Lesson_2.Entities.Account;
import Assignments.Assignment_Lesson_2.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Account account = session.get(Account.class, 2);
            if (account != null) {
                session.remove(account);
                System.out.println("Deleted account successfully!");
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
