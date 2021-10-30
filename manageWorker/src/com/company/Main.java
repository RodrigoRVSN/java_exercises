package com.company;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ManageEmployee manage = new ManageEmployee();
        Payroll payroll = new Payroll();

        int option = 0;
        while(option!=7){

            option = Integer.parseInt( JOptionPane.showInputDialog("Qual a opção desejada: "
                    + "\n1: Cadastrar: "
                    + "\n2: Buscar Funcionario"
                    + "\n3: Listar todos"
                    + "\n4: Cadastrar funcionário (FP)"
                    + "\n5: Buscar por nome"
                    + "\n6: Listar todos (FP)"
                    + "\n7: Sair"));

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
                    String[] options = {"Gerente", "Vendedor"};

                    int index = JOptionPane.showOptionDialog(null, "Deseja cadastrar um gerente ou um vendedor?",
                            "Cadastrar funcionário",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

                    String name = JOptionPane.showInputDialog("Qual o nome?");
                    String cpf = JOptionPane.showInputDialog("Qual o CPF?");
                    double wage = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário?"));
                    if(index == 0){
                        String area = JOptionPane.showInputDialog("Qual a área?");
                        Manager man = new Manager(name, cpf, wage, area);
                        payroll.registerManager(man);
                    } else {
                        double comission = Double.parseDouble(JOptionPane.showInputDialog("Qual a comissão?"));
                        Seller sel = new Seller(name, cpf, wage, comission);
                        payroll.registerSeller(sel);
                    }
                    break;
                }
                case 5:{
                    String name = JOptionPane.showInputDialog("Qual o nome?");
                    Employee func = payroll.findByName(name);
                    JOptionPane.showMessageDialog(null, func.print());
                    break;
                }
                case 6:{
                    JOptionPane.showMessageDialog(null, payroll.printAll());
                    break;
                }
                case 7:{
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
