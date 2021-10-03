package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    /*
    The @Entity annotation indicates that the Customer class is a JPA entity that should translate into the
    corresponding table in the database. IntelliJ IDEA designates it with The Entity icon in the gutter.

    The @Id annotation indicates that the id field is the object's ID.
    The @GeneratedValue tells JPA that the ID should be generated automatically.
     */

    private Integer id;

    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
