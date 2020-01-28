/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Target;
import org.hibernate.annotations.Type;

/*
 * @author harmi
    This is a model class which is mapped with hibernate.cfg.xml
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails{

    @Id @GeneratedValue(strategy=GenerationType.AUTO) //ask hibernate to generate the value, auto-let hibernate decide what to use, Table-hibernate will create a seperate table and use it. 
    private int userId;
    @Column(name="USER_NAME")
    private String nameUser;
    @ElementCollection(fetch=FetchType.EAGER) //tell hibernate that this is collection
    @JoinTable(name="USER_ADDRESS", //changes name of the table 
        joinColumns=@JoinColumn(name="USER_ID") //changes name of the column
    )
   
    private Collection<Address> listOfAddress = new ArrayList<Address>();     //Using Collection Interface

    
    
    
    public Collection<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Collection<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    
}
