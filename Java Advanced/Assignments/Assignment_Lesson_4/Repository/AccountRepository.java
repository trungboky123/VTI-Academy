package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Account;
import Assignments.Assignment_Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AccountRepository implements IAccountRepository{
    @Override
    public void create(Account account) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(account);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    @Override
    public List<Account> getAccountsHavingHighestSalary() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Account a WHERE a.salary = (SELECT max(a1.salary) FROM Account a1)";
            List<Account> accounts = session.createQuery(hql, Account.class).getResultList();
            return accounts;
        }
    }
}
