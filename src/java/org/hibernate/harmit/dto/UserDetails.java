/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.dto;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*
 * @author harmi
    This is a model class which is mapped with hibernate.cfg.xml
 */
@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO) //ask hibernate to generate the value, auto-let hibernate decide what to use, Table-hibernate will create a seperate table and use it. 
    private int userId;
    private String nameUser;
    @Temporal(TemporalType.DATE)//only save Date 
    private Date purchasDate;
    private String Address;
    private String descripton;

    public int getUserId() {
        return userId;
    }

    public Date getPurchasDate() {
        return purchasDate;
    }

    public void setPurchasDate(Date purchasDate) {
        this.purchasDate = purchasDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
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
