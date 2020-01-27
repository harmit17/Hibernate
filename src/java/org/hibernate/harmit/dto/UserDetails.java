/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hibernate.harmit.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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

    @Id @GeneratedValue(strategy=GenerationType.AUTO) //ask hibernate to generate the value, auto-let hibernate decide what to use, Table-hibernate will create a seperate table and use it. 
    private int userId;
    @Column(name="USER_NAME")
    private String nameUser;
    @Column(name ="PURCHASE_DATE")
    @Temporal(TemporalType.DATE)//only save Date 
    private Date purchaseDate;
    @Column(name="DESCRIPTION")
    private String description;
    @Embedded
    @AttributeOverrides({
    @AttributeOverride (name="street", column=@Column(name="HOME_STREET_NAME")),
    @AttributeOverride (name="city", column=@Column(name="HOME_CITY_NAME")),
    @AttributeOverride (name="state", column=@Column(name="HOME_STATE_NAME")),
    @AttributeOverride (name="pncode", column=@Column(name="HOME_PIN_CODE"))})
    private Address home_address;
    @Embedded
    private Address office_address;
   
    
    
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchasDate) {
        this.purchaseDate = purchasDate;
    }

    public Address getHome_address() {
        return home_address;
    }

    public void setHome_address(Address home_address) {
        this.home_address = home_address;
    }

    public Address getOffice_address() {
        return office_address;
    }

    public void setOffice_address(Address office_address) {
        this.office_address = office_address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descripton) {
        this.description = descripton;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    
}
