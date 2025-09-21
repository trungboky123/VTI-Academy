package Assignments.Assignment_Lesson_2.Demo;

import Assignments.Assignment_Lesson_2.Entities.Account;
import Assignments.Assignment_Lesson_2.Utils.HibernateUtils;
import org.hibernate.Session;
import java.util.List;

public class Read {
    public static void main(String[] args) {
        List<Account> accounts;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Account";
            accounts = session.createQuery(hql, Account.class).list();
            for(Account account : accounts) {
                System.out.println("ID: " + account.getId() + ", Email: " + account.getEmail() + ", Full Name: " + account.getFullName() + ", Username: " + account.getUsername() + ", Department: " + account.getDepartment().getName() + ", Position: " + account.getPosition().getName());
            }
        }
    }
}
