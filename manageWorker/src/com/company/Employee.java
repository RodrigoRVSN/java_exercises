package com.company;

public class Employee {
    private String cpf;
    private String name;
    private double wage;

    public Employee(){};

    public Employee(String cpf, String name, double wage) {
        this.cpf = cpf;
        this.name = name;
        this.wage = wage;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String print (){
        return "\nCPF: " + getCpf() +
                "\nNome: " + getName() +
                "\nSalário: " + getWage();
    }

    public double calculateTax(){
        return wage * 0.1;
    }

    public double calculateWageLiquid(double tax){
        return getWage() - tax;

    }
}
