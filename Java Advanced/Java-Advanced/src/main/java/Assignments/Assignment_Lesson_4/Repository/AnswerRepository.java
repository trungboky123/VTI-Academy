package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Answer;
import Assignments.Assignment_Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AnswerRepository implements IAnswerRepository{
    @Override
    public void create(Answer answer) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(answer);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
