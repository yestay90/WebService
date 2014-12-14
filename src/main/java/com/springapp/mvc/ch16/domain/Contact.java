package com.springapp.mvc.ch16.domain;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ymuratov on 12/10/14.
 */

@Entity
@Table(name = "contact")
public class Contact implements Serializable {

    private Long id;
    private int version;
    private String lastName;
    private String firstName;
    private DateTime birthDate;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    public Long getId(){
        return id;
    }

    @Version
    @Column(name="version")
    public int getVersion()
    {
        return version;
    }

    @Column(name="lastname")
    public String getLastName(){
        return lastName;
    }

    @Column(name="firstname")
    public String getFirstName(){
        return firstName;
    }

    @Column(name= "birthdate")
    @Type(type="org.joda.time.contrib.hibernate.PersistentDateTime")
    public DateTime getBirthDate(){
        return birthDate;
    }

    public String toString() {
        return "Contact - Id: " + id + ", First name: " + firstName
                + ", Last name: " + lastName + ", Birthday: " + birthDate;
    }



}
