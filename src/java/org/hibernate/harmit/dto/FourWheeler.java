/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.dto;

import javax.persistence.Entity;

/**
 *If u Mark 4Wheeler & 2Wheeler as entity but Hibernate will not create 2 separate tables it will 
 * insert data in same Vehicle table
 * Hibernate by default implements strategy of single table (all data will be inserted in single table)
 * One common table for all the objects
 */
@Entity
//@DiscriminatorValue("Car") change DTYPE class name to Car
public class FourWheeler extends Vehicle {
    
    private String SteeringWheel;

    public String getSteeringWheel() {
        return SteeringWheel;
    }

    public void setSteeringWheel(String SteeringWheel) {
        this.SteeringWheel = SteeringWheel;
    }
}
