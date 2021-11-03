package com.company;

import java.util.ArrayList;

// Cliente
public class Customer {
    private String name;
    private String email;
    private String typePerson;

    ArrayList<Order> listOrders = new ArrayList();

    public Customer() {
    }

    public Customer(String name, String email, String typePerson) {
        this.name = name;
        this.email = email;
        this.typePerson = typePerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypePerson() {
        return typePerson;
    }

    public void setTypePerson(String typePerson) {
        this.typePerson = typePerson;
    }

    public String print (){
        return "\nNome: " + getName() +
                "\nE-mail: " + getEmail();
    }
}
