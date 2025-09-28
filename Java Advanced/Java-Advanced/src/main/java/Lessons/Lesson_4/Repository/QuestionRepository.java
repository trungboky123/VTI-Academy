package Lessons.Lesson_4.Repository;

import Lessons.Lesson_4.Entity.Question;
import Lessons.Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class QuestionRepository implements IQuestionRepository {
    @Override
    public void create(Question question) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(question);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }
}
