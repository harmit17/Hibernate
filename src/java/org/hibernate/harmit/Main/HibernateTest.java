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
import org.hibernate.harmit.dto.FourWheeler;
import org.hibernate.harmit.dto.TwoWheeler;
import org.hibernate.harmit.dto.UserDetails;
import org.hibernate.harmit.dto.Vehicle;

public class HibernateTest {
    
    public static void main(String[] args) {
            
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("Car");
        
        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setVehicleName("Bike");
        twoWheeler.setSteeringHandle("Bike Steering Handle");
        
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setVehicleName("Car");
        fourWheeler.setSteeringWheel("Car Steering Wheel");
        
        //takes hibernate.cfg.xml as configuration file & build sessionfactory object based on the configuration we provided
        SessionFactory sessionFactory  = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();//define single unit of work
        
        session.save(vehicle);
        session.save(twoWheeler);
        session.save(fourWheeler);
        session.getTransaction().commit();
        session.close();  
    }
    
}
