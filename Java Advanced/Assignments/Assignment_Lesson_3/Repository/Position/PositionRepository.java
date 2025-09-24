package Assignments.Assignment_Lesson_3.Repository.Position;

import Assignments.Assignment_Lesson_3.Entity.Position;
import Assignments.Assignment_Lesson_3.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PositionRepository implements IPositionRepository{

    @Override
    public void create(Position position) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(position);
            transaction.commit();
        }
    }

    @Override
    public List<Position> getAllPosition() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM Position";
            List<Position> positions = session.createQuery(hql, Position.class).list();
            return positions;
        }
    }
}
