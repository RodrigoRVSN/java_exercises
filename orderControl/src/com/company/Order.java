package com.company;

import java.util.ArrayList;

public class Order {
    // add item
    private int id;
    private String date;
    private double totalValue;
    private String customerCPF;
    private boolean status;

    private Provider provider;

    ArrayList<Item> listItens = new ArrayList();

}
