package com.company;

import java.util.ArrayList;

// Pessoa jurídica
public class JuridicPerson extends Customer {
    private String cnpj;
    private double billingTerm;

    ArrayList<Order> listOrders = new ArrayList();

    public JuridicPerson() {}

    public JuridicPerson(String name, String email, String typePerson, String cnpj, double billingTerm) {
        super(name, email, typePerson);
        this.cnpj = cnpj;
        this.billingTerm = billingTerm;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getBillingTerm() {
        return billingTerm;
    }

    public void setBillingTerm(double billingTerm) {
        this.billingTerm = billingTerm;
    }


    public String print(){
        return super.print() + "\nCNPJ: " + getCnpj() + "\nPrazo máximo de faturamento: " + getBillingTerm();
    }

}
