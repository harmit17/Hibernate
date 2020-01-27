/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.Main;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.harmit.dto.Address;
import org.hibernate.harmit.dto.UserDetails;

/**
 *
 * @author harmi
 */
public class HibernateTest {
    
    public static void main(String[] args) {
        
        UserDetails user = new UserDetails();
        Address addr = new Address();
        
       
        user.setNameUser("Harmit");
        user.setPurchasDate(new Date());
        user.setDescripton("Milk & Bread");
        addr.setStreet("Viharika park Society");
        addr.setCity("Baroda");
        addr.setState("Gujarat");
        addr.setPncode("390021");
        user.setAddress(addr);
        
        UserDetails user2 = new UserDetails();
        Address addr2 = new Address();
        
        user2.setNameUser("Sanket");
        user2.setPurchasDate(new Date());
        user2.setDescripton("Chocolate");
        addr2.setStreet("SG highway");
        addr2.setCity("Ahmedabad");
        addr2.setState("Gujarat");
        addr2.setPncode("380054");
        user2.setAddress(addr2);
                
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();//takes hibernate.cfg.xml as configuration file & build sessionfactory object based on the configuration we provided
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();//define single unit of work
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();
        
        /*
        user = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        user = (UserDetails)session.get(UserDetails.class,1); //1 for primary key
        System.out.println("User Name retrived is " + user.getNameUser());
        */
    }
    
}
