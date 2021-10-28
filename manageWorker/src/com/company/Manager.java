package com.company;

public class Manager extends Employee {
    private String area;

    public Manager(String name, String cpf, double wage, String area) {
        super(name, cpf, wage);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String print(){
        return super.print() + "\nÁrea: " + getArea();
    }

    public double calculateTax(){
        return super.getWage() * 0.1;
    }
}
