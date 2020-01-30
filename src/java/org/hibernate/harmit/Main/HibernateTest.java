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
import org.hibernate.harmit.dto.Vehicle;

public class HibernateTest {
    
    public static void main(String[] args) {
        
        UserDetails user = new UserDetails();
        user.setNameUser("Harmit");
        
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Bike");
     
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();//takes hibernate.cfg.xml as configuration file & build sessionfactory object based on the configuration we provided
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();//define single unit of work
        session.persist(user);
        session.getTransaction().commit();
        session.close();  
    }
    
}
