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

    public ArrayList<Order> getListOrders() {
        return listOrders;
    }

    public void setListOrders(Order listOrders) {
        // Adiciona o objeto do pedido ao array
        this.listOrders.add(listOrders);
    }

    // Imprime a pessoa
    public String print(){
        return super.print() + "\nCNPJ: " + getCnpj() + "\nPrazo máximo de faturamento: " + getBillingTerm();
    }

    // Imprime os pedidos
    public void printOrders(){
        for(int i=0; i<this.listOrders.size(); i++) {
            System.out.println(listOrders.get(i).printInOrders());
        }
    }
}
