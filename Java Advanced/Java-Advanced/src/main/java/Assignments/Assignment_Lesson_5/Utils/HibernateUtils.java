package Assignments.Assignment_Lesson_5.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;
    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        if (sessionFactory == null) {
            sessionFactory = configuration.buildSessionFactory();
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
