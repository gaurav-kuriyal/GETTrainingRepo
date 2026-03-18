package com.coforge;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.entities.AadharCard;
import com.coforge.entities.Citizen;
import com.coforge.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.createQuery("From Citizen",Citizen.class).list().forEach(c->System.out.println(c));
        
        AadharCard aadhar = new AadharCard("Hyderabad");
        Citizen citizen = new Citizen("Gaurav",aadhar);
        Transaction tx = session.beginTransaction();
        session.persist(citizen);
        tx.commit();
    }
}
