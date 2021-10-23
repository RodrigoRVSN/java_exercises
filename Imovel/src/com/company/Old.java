package com.company;

public class Old extends  Immobile{
    private double sub;

    public Old(Immobile immobile, double sub) {
        super(immobile.getAddress(), immobile.getPrice());
        this.sub = sub;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public void newPrice (){
        this.setPrice(this.getPrice() - this.sub);
        System.out.println("Novo valor: " + this.getPrice());
    }
}
