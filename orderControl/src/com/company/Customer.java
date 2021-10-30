package com.company;

import java.util.ArrayList;

// Cliente
public class Customer {
    private String name;
    private String email;
    private String typePerson;
    private String cpf;
    private String cnpj;
    private double installmentAmount;
    private double billingTerm;

    ArrayList<Order> listOrders = new ArrayList();

    public Customer() {
    }

    public Customer(String name, String email, String typePerson, String cpf, String cnpj, double installmentAmount, double billingTerm) {
        this.name = name;
        this.email = email;
        this.typePerson = typePerson;
        if (getTypePerson().equalsIgnoreCase("pf")) {
            this.cpf = cpf;
            this.cnpj = cnpj;
        } else {
            this.installmentAmount = installmentAmount;
            this.billingTerm = billingTerm;
        }
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public double getBillingTerm() {
        return billingTerm;
    }

    public void setBillingTerm(double billingTerm) {
        this.billingTerm = billingTerm;
    }

    public void print(){
        System.out.println("-------------------------------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("E-mail: " + getEmail());
        if(getTypePerson().equalsIgnoreCase("pf")){
            System.out.println("CPF: " + getCpf());
            System.out.println("Quantidade máxima de parcelamento: " + getInstallmentAmount());
        } else if(getTypePerson().equalsIgnoreCase("pj")) {
            System.out.println("CNPJ: " + getCnpj());
            System.out.println("Prazo máximo de faturamento: " + getBillingTerm());
        }
    }
}
