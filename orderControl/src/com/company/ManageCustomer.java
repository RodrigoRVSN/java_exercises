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

    public void registerPhysicalPerson(PhysicalPerson objCustomer) {
        listPhysicalPersons.add(objCustomer);
    }

    public void registerJuridicPerson(JuridicPerson objCustomer) {
        listJuridicPersons.add(objCustomer);
    }

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
}
