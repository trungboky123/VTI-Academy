package Assignments.Assignment_Lesson_1.Exercise_2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static HibernateUtils instance;
    private static SessionFactory sessionFactory;

    // a) Singleton Pattern
    private HibernateUtils(){

    }
    public static synchronized HibernateUtils getInstance(){
        if(instance == null){
            instance = new HibernateUtils();
        }
        return instance;
    }

    // b) configure() method
    private Configuration configure(){
        Configuration cfg = new Configuration();
        cfg.configure();
        return cfg;
    }

    // c) buildSessionFactory() method
    public SessionFactory buildSessionFactory(){
        if(sessionFactory == null || sessionFactory.isClosed()){
            sessionFactory = configure().buildSessionFactory();
        }
        return sessionFactory;
    }

    // d) closeFactory() method
    public void closeFactory(){
        if(sessionFactory != null && !sessionFactory.isClosed()){
            sessionFactory.close();
        }
    }

    // e) openSession() method
    public Session openSession(){
        return buildSessionFactory().openSession();
    }
}
