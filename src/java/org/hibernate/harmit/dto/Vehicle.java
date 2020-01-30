
package org.hibernate.harmit.dto;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
/*
@DiscriminatorColumn(
        name = "VEHICLE_TYPE",
        discriminatorType= DiscriminatorType.STRING         //DTYPE column
)
*/
public class Vehicle {

    @Id @GeneratedValue(strategy = GenerationType.TABLE)    //When you use Table per Class Must use @GeneratedValue(Strategy =GenerationType.Table)
    private int vehicleId;
    private String vehicleName;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }    
}
