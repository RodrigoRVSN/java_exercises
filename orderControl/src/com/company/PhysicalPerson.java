package com.company;

import java.util.ArrayList;

// Pessoa física
public class PhysicalPerson extends Customer {

    private String cpf;
    private double installmentAmount;

    ArrayList<Order> listOrders = new ArrayList();

    public PhysicalPerson() { }

    public PhysicalPerson(String name, String email, String typePerson, String cpf, double installmentAmount) {
        super(name, email, typePerson);
        this.cpf = cpf;
        this.installmentAmount = installmentAmount;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public String print(){
        return super.print() + "\nCPF: " + getCpf() + "\nQuantidade máxima de parcelamento: " + getInstallmentAmount();
    }

}
