
package org.hibernate.harmit.dto;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Bike") change DTYPE class name to BIKE
public class TwoWheeler extends Vehicle{
    
    private String SteeringHandle; 

    public String getSteeringHandle() {
        return SteeringHandle;
    }

    public void setSteeringHandle(String SteeringHandle) {
        this.SteeringHandle = SteeringHandle;
    }
}
