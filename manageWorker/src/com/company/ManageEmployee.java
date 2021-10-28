package com.company;

import java.util.ArrayList;

public class ManageEmployee {
    private ArrayList<Employee> listEmployers;

    public ManageEmployee(){
        this.listEmployers = new ArrayList<Employee>();
    }

    public void register(Employee objEmployee){
        listEmployers.add(objEmployee);
    }

    public String printAll(){
        String text = "";

        if( this.listEmployers.size() == 0){
            text += "Lista vazia";
        } else{
            for(Employee objEmployee: this.listEmployers){
                text += "\n---------------------------";
                text += objEmployee.print();
            }
        }

        return text;
    }

    public Employee findByCpf (String cpf) {
        for(Employee objEmployee: this.listEmployers){
            System.out.println(cpf);
            System.out.println(objEmployee.getCpf());
            if(objEmployee.getCpf().equalsIgnoreCase(cpf)){
                return objEmployee;
            }
        }

        return null;
    }

}
