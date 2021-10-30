package com.company;

import java.util.ArrayList;

public class Payroll {
    private ArrayList<Manager> listManagers;
    private ArrayList<Seller> listSellers;

    public Payroll(){
        this.listManagers = new ArrayList<Manager>();
        this.listSellers = new ArrayList<Seller>();
    }

    public void registerManager(Manager objEmployee){
        listManagers.add(objEmployee);
    }

    public void registerSeller(Seller objEmployee){
        listSellers.add(objEmployee);
    }


    public Employee findByName (String name) {
        for(Seller objEmployee: this.listSellers){
            if(objEmployee.getName().equalsIgnoreCase(name)){
                return objEmployee;
            }
        }
        for(Manager objEmployee: this.listManagers){
            if(objEmployee.getName().equalsIgnoreCase(name)){
                return objEmployee;
            }
        }

        return null;
    }

    public String printAll(){
        String text = "";

        if( this.listManagers.size() == 0){
            text += "Lista vazia";
        } else{
            for(Employee objEmployee: this.listManagers){
                text += "\n---------------------------";
                text += objEmployee.print();
            }
        }


        if( this.listSellers.size() == 0){
            text += "Lista vazia";
        } else{
            for(Employee objEmployee: this.listSellers){
                text += "\n---------------------------";
                text += objEmployee.print();
            }
        }

        return text;
    }

}
