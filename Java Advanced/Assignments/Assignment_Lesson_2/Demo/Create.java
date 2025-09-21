package Assignments.Assignment_Lesson_2.Demo;

import Assignments.Assignment_Lesson_2.Entities.Account;
import Assignments.Assignment_Lesson_2.Entities.Department;
import Assignments.Assignment_Lesson_2.Entities.Position;
import Assignments.Assignment_Lesson_2.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.time.LocalDate;

public class Create {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            Position position = new Position();
            Position position1 = new Position();
            Position position2 = new Position();
            position.setName("Director");
            position1.setName("Manager");
            position2.setName("Employee");

            Department department = new Department();
            department.setName("Marketing");

            Account account = new Account();
            account.setEmail("trunghiennguyen71@gmail.com");
            account.setFullName("Nguyen Trung Hien");
            account.setUsername("trunghien123");
            account.setDepartment(department);
            account.setPosition(position);
            account.setCreateDate(LocalDate.now());

            Account account1 = new Account();
            account1.setEmail("hieuxautrai050312@gmail.com");
            account1.setFullName("Nguyen Trung Hieu");
            account1.setUsername("trunghieu123");
            account1.setDepartment(department);
            account1.setPosition(position2);
            account1.setCreateDate(LocalDate.now());

            Account account2 = new Account();
            account2.setEmail("vqh051104@gmail.com");
            account2.setFullName("Vu Quynh Huong");
            account2.setUsername("huongvu123");
            account2.setDepartment(department);
            account2.setPosition(position1);
            account2.setCreateDate(LocalDate.now());

            session.persist(department);
            session.persist(position);
            session.persist(position1);
            session.persist(position2);
            session.persist(account);
            session.persist(account1);
            session.persist(account2);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
