package com.simnewman;

public class Customer {
    private final long id;
    private final String lastname;

    public Customer(long id, String lastname) {
        this.id = id;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }
}
