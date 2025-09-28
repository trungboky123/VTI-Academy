package Lessons.Lesson_1.Service;

import Lessons.Lesson_1.Entity.Account;
import Lessons.Lesson_1.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AccountImpl implements AccountDao{
    @Override
    public void save(Account account){
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.persist(account);
            transaction.commit();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
