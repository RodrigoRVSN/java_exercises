package com.company;

import java.util.ArrayList;

public class ManageCustomer {
    private ArrayList<PhysicalPerson> listPhysicalPersons;
    private ArrayList<JuridicPerson> listJuridicPersons;

    ArrayList<Order> listOrders = new ArrayList();

    public ManageCustomer() {
        this.listPhysicalPersons = new ArrayList<PhysicalPerson>();
        this.listJuridicPersons = new ArrayList<JuridicPerson>();
    }

    public ArrayList<JuridicPerson> getListJuridicPersons() {
        return listJuridicPersons;
    }

    public void setListJuridicPersons(ArrayList<JuridicPerson> listJuridicPersons) {
        this.listJuridicPersons = listJuridicPersons;
    }

    public void registerPhysicalPerson(PhysicalPerson objCustomer) {
        listPhysicalPersons.add(objCustomer);
    }

    public void registerJuridicPerson(JuridicPerson objCustomer) {
        listJuridicPersons.add(objCustomer);
    }

    // Imprimi todas as pessaos
    public String printAll() {
        String text = "";

        if (this.listPhysicalPersons.size() == 0 && this.listJuridicPersons.size() == 0) {
            text += "\nLista vazia";
        }

        if (this.listPhysicalPersons.size() != 0) {
            for (Customer objCustomer : this.listPhysicalPersons) {
                text += "\n---------------------------";
                text += objCustomer.print();
            }
        }

        if (this.listJuridicPersons.size() != 0)
            for (Customer objCustomer : this.listJuridicPersons) {
                text += "\n---------------------------";
                text += objCustomer.print();
            }

        text += "\n\n---------------------------\n\n";
        return text;
    }

    // Adiciona o pedido para pessoas fisicas (array de pedidos em PhysicalPerson)
    public void addOrderToPersonCpf(String cpf, Order or){
        if (this.listPhysicalPersons.size() != 0) {
            // Percorre o array de pessaos fisicas
            for (PhysicalPerson objPhysical : this.listPhysicalPersons) {
                if(objPhysical.getCpf().equalsIgnoreCase(cpf)){
                    // Adiciona ao array de pedidos da pessoa fisica
                    objPhysical.setListOrders(or);
                }
            }
        }
    }

    // Adiciona o pedido para pessoas juridicas (array de pedidos em JuridicPerson)
    public void addOrderToPersonCnpj(String cnpj, Order or){
        if (this.listPhysicalPersons.size() != 0) {
            for (JuridicPerson objJuridic : this.listJuridicPersons) {
                if(objJuridic.getCnpj().equalsIgnoreCase(cnpj)){
                    // Adiciona ao array de pedidos da pessoa juridica
                    objJuridic.setListOrders(or);
                }
            }
        }
    }

    // Imprime TODOS os pedidos (6.4)
    public void printOrders(){
        if (this.listPhysicalPersons.size() != 0) {
            for (PhysicalPerson objPhysical : this.listPhysicalPersons) {
                objPhysical.printOrders();
            }
        }
        if (this.listJuridicPersons.size() != 0) {
            for (JuridicPerson objJuridical : this.listJuridicPersons) {
                objJuridical.printOrders();
            }
        }
    }
}
