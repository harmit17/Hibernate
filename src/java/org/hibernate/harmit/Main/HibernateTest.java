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
import org.hibernate.harmit.dto.UserDetails;

/**
 *
 * @author harmi
 */
public class HibernateTest {
    
    public static void main(String[] args) {
        
        UserDetails user = new UserDetails();
        user.setNameUser("Harmit");
        user.setAddress("7,Viharika Park society"); 
        user.setPurchasDate(new Date());
        user.setDescripton("Milk & Bread");
        
        UserDetails user2 = new UserDetails();
        user2.setNameUser("Sanket");
        user2.setAddress("Surat"); 
        user2.setPurchasDate(new Date());
        user2.setDescripton("Chocolate");
        
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
