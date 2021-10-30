package com.company;

public class Item {
    private int quantity;
    private String name;
    private double unitPrice;
    private double totalPrice;

    public Item (){}

    public Item(int quantity, String name, double unitPrice, double totalPrice) {
        this.quantity = quantity;
        this.name = name;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void print(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("Quantidade: " + getQuantity());
        System.out.println("Preço por unidade: " + getUnitPrice());
        System.out.println("Preço total:: " + getTotalPrice());
    }
}
