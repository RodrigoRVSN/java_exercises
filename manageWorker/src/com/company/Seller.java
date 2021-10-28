package com.company;

public class Seller extends Employee {
    private double comission;

    public Seller(String name, String cpf, double wage, double comission) {
        super(name, cpf, wage);
        this.comission = comission;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String print(){
        return super.print() + "\nComissão: " + getComission();
    }


    public double calculateTax(){
        return 2;
    }
}
