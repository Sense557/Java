package com.pwskills.HibDemo;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stud = null;
        Student stud1 = null;
    
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        stud = session.get(Student.class, 101); 
        System.out.println(stud);
        session.close();
        
        Session session1 = sessionFactory.openSession();
        stud1 = session1.get(Student.class, 101);
        System.out.println(stud1);
        session1.close();
    }
}
