package Assignments.Assignment_Lesson_1.Exercise_3.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static SessionFactory sessionFactory;
    static {
        Configuration cfg = new Configuration();
        cfg.configure();
        if (sessionFactory == null){
            sessionFactory = cfg.buildSessionFactory();
        }
    }
    public static SessionFactory getsessionFactory(){
        return sessionFactory;
    }
}
