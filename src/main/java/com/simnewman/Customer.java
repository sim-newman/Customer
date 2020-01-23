package com.simnewman;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="surname")
    private String lastName;

    //Default constructor not used, it is only used for JPA
    protected Customer (){}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() { return lastName; }
}
