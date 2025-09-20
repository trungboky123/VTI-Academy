package Assignments.Assignment_Lesson_1.Exercise_1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.time.LocalDate;
import java.util.List;

public class GroupRepository {
    // a) createGroups
    public void createGroups(String name){
        Transaction transaction = null;
        Session session = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Group group = new Group();
            group.setName(name);
            group.setCreateDate(LocalDate.now());
            session.persist(group);
            transaction.commit();
            System.out.println("Created group successfully!");
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    // b)getAllGroups
    public List<Group> getAllGroups(){
        Session session = null;
        List<Group> groups;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            groups = session.createQuery("FROM Group", Group.class).list();
        } finally {
            if(session != null){
                session.close();
            }
        }
        return groups;
    }

    // c) getGroupById
    public Group getGroupById(int id){
        Group group = null;
        Session session = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            group = session.get(Group.class, id);
        } finally {
            if(session != null){
                session.close();
            }
        }
        return group;
    }

    // d) getGroupByName
    public Group getGroupByName(String name){
        Group group = null;
        Session session = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            String hql = "FROM Group g WHERE g.name = :name";
            group = session.createQuery(hql, Group.class).setParameter("name", name).uniqueResult();
        } finally {
            if(session != null){
                session.close();
            }
        }
        return group;
    }

    // e) updateGroup
    public void updateGroup(int id, String newName){
        Session session = null;
        Transaction transaction = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Group group = session.get(Group.class, id);
            if(group != null){
                group.setName(newName);
                group.setCreateDate(LocalDate.now());
                System.out.println("Group is updated successfully!");
            }
            else{
                System.out.println("Cannot find group with ID = " + id);
            }
            transaction.commit();
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    // f) deleteGroup
    public void deleteGroup(int id){
        Session session = null;
        Transaction transaction = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            Group group = session.get(Group.class, id);
            if(group != null){
                session.remove(group);
                System.out.println("Deleted group with ID = " + id);
            }
            else{
                System.out.println("Cannot find group with ID = " + id);
            }
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    // g) isGroupExistById
    public boolean isGroupExistById(int id){
        Session session = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            Group group = session.get(Group.class, id);
            return group != null;
        } finally {
            if(session != null){
                session.close();
            }
        }
    }

    // h) isGroupExistByName
    public boolean isGroupExistByName(String name){
        Session session = null;
        try{
            session = HibernateUtils.getSessionFactory().openSession();
            String hql = "FROM Group g WHERE g.name = :name";
            Group group = session.createQuery(hql, Group.class).setParameter("name", name).uniqueResult();
            return group != null;
        } finally {
            if(session != null){
                session.close();
            }
        }
    }
}
