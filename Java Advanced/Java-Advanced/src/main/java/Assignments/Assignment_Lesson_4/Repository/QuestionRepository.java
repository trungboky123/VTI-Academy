package Assignments.Assignment_Lesson_4.Repository;

import Assignments.Assignment_Lesson_4.Entity.Question;
import Assignments.Assignment_Lesson_4.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import java.util.Objects;

public class QuestionRepository implements IQuestionRepository{
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

    @Override
    public List<Object[]> getQuestionsHavingMoreThan2CorrectAnswers() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT q.id, q.content, count(a.id) FROM Question q JOIN q.answers a WHERE a.isCorrect = true GROUP BY q.id HAVING count(a.id) > 2";
            List<Object[]> questions = session.createQuery(hql, Object[].class).getResultList();
            return questions;
        }
    }
}
