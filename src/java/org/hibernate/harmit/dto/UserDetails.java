/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Target;

/*
 * @author harmi
    This is a model class which is mapped with hibernate.cfg.xml
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails{

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO) //ask hibernate to generate the value, auto-let hibernate decide what to use, Table-hibernate will create a seperate table and use it. 
    private int userId;
    private String nameUser;
    @Temporal(TemporalType.DATE)//only save Date 
    private Date purchasDate;
    private String descripton;
    @Embedded
    private Address address;
   
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPurchasDate() {
        return purchasDate;
    }

    public void setPurchasDate(Date purchasDate) {
        this.purchasDate = purchasDate;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    
}
