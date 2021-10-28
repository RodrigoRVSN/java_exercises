package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        ManageEmployee manage = new ManageEmployee();

        int option = 0;
        while(option!=4){

            option = Integer.parseInt( JOptionPane.showInputDialog("Qual a opção desejada: "
                    + "\n1: Cadastrar: "
                    + "\n2: Buscar Funcionario"
                    + "\n3: Listar todos"
                    + "\n4: Sair"));

            switch(option){
                case 1:{
                    String name = JOptionPane.showInputDialog("Qual o nome?");
                    String cpf = JOptionPane.showInputDialog("Qual o CPF?");
                    double wage = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
                    Employee empl = new Employee(cpf, name, wage);
                    manage.register(empl);
                    break;
                }
                case 2:{
                    String cpf = JOptionPane.showInputDialog("Qual o CPF?");
                    Employee func = manage.findByCpf(cpf);
                    JOptionPane.showMessageDialog(null, func.print());
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null, manage.printAll());
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;
                }
            }

        }
    }

}
