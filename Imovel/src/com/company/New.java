package com.company;

public class New extends Immobile{
    private double addition;

    public New(Immobile immobile, double addition) {
        super(immobile.getAddress(), immobile.getPrice());
        this.addition = addition;
    }

    public double getAddition() {
        return addition;
    }

    public void setAddition(double addition) {
        this.addition = addition;
    }

    public void newPrice (){
        super.setPrice(super.getPrice() + this.addition);
        System.out.println("Novo valor: " + super.getPrice());
    }

}
