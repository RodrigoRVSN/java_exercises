package com.company;

public class Main {

    public static void main(String[] args) {
        Immobile immobile = new Immobile("Ernestino", 540);
        New newImmobile = new New(immobile, 60);
        Old oldImmobile = new Old(immobile, 90);

        newImmobile.newPrice();
        oldImmobile.newPrice();
}}
