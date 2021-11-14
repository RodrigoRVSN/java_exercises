package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputOption = new Scanner(System.in);
        Scanner inputReport = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner inputOrder = new Scanner(System.in);
        Scanner inputTest = new Scanner(System.in);

        ArrayList<Provider> listProviders = new ArrayList();
        ArrayList<Item> listItens = new ArrayList();
        ArrayList<PhysicalPerson> listCpf = new ArrayList();
        ArrayList<PhysicalPerson> listPhysicalPerson = new ArrayList();

        ManageCustomer manage = new ManageCustomer();

        int option = 0, reportOption = 0, orderOption = 0;

        do {
            System.out.println("---------- MENU --------");
            System.out.println("<1> Cadastro de Clientes");
            System.out.println("<2> Cadastro de Fornecedores");
            System.out.println("<3> Cadastro de Produtos");
            System.out.println("<4> Efetuar Pedido");
            System.out.println("<5> Baixa de pagamento de um pedido");
            System.out.println("<6> Relatórios");
            System.out.println("<7> Sair");
            System.out.println("Digite uma opcao: ");
            option = inputOption.nextInt();
            System.out.println("------------------------");

            switch (option) {
                case 1:
                    System.out.println("---------- CADASTRO DE CLIENTES --------");
                    System.out.println("Digite 'PF' para pessoa física e 'PJ' para jurídica: ");
                    String typePerson = input.nextLine();
                    System.out.println("Digite nome: ");
                    String name = input.nextLine();
                    System.out.println("Digite e-mail: ");
                    String email = input.nextLine();

                    if (typePerson.equalsIgnoreCase("pf")) {
                        System.out.println("Digite o CPF: ");
                        String cpf = input.nextLine();
                        System.out.println("Digite a quantidade máxima de parcelamento: ");
                        double amount = input.nextDouble();
                        PhysicalPerson physical = new PhysicalPerson(name, email, typePerson, cpf, amount);
                        manage.registerPhysicalPerson(physical);

                    } else {
                        System.out.println("Digite o CNPJ:");
                        String cnpj = input.nextLine();
                        System.out.println("Digite o prazo máximo de faturamento: ");
                        double deadline = input.nextDouble();
                        JuridicPerson juridic = new JuridicPerson(name, email, typePerson, cnpj, deadline);
                        manage.registerJuridicPerson(juridic);
                    }
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("---------- CADASTRO DE FORNECEDORES --------");
                    Provider prov = new Provider();
                    System.out.println("Digite nome:");
                    prov.setProviderName(input.nextLine());
                    System.out.println("Digite o CNPJ:");
                    prov.setProviderCNPJ(input.nextLine());
                    listProviders.add(prov);
                    break;
                case 3:
                    System.out.println("---------- CADASTRO DE PRODUTOS --------");
                    Item it = new Item();
                    System.out.println("Digite nome:");
                    it.setName(input.nextLine());
                    System.out.println("Digite a quantidade:");
                    it.setQuantity(input.nextInt());
                    System.out.println("Digite o preço da unidade:");
                    it.setUnitPrice(input.nextDouble());
                    it.setTotalPrice(it.getUnitPrice() * it.getQuantity());
                    input.nextLine();
                    listItens.add(it);
                    break;
                case 4:
                    Order or = new Order();
                    System.out.println("---------- CADASTRO DE PEDIDOS --------");
                    System.out.println(" Digite 1 para lan�ar pedido em CPF ou digite qualquer outro n�mero para CNPJ: ");
                    orderOption = inputOrder.nextInt();

                    if (orderOption == 1) {
                        // Se for lancar para cpf
                        System.out.println("Digite o CPF para o qual ser� lan�ado o pedido: ");
                        or.setCustomerCPF(inputOrder.next());
                        // chama a funcao de adicionar um pedido
                        manage.addOrderToPersonCpf(or.getCustomerCPF(), or);
                        // O for abaixo pode ser refatorado para ser um do while
                        for (PhysicalPerson ph : listCpf) {
                            System.out.println(ph.getCpf());
                            System.out.println(or.getCustomerCPF());
                            if (ph.getCpf().equalsIgnoreCase(or.getCustomerCPF())) {
                                String test = "";
                                do {
                                    System.out.println("Para finalizar seu pedido digite F ");
                                    test = inputTest.nextLine();
                                } while (test != "f");

                            } else {
                                System.out.println("CPF inv�lido, tente novamente...");

                            }
                        }
                    } else {
                        System.out.println("Digite o CNPJ para o qual ser� lan�ado o pedido: ");
                    }

                    break;
                case 5:
                    break;
                case 6:
                    do {
                        System.out.println("---------- RELATÓRIOS --------");
                        System.out.println("<1> Listagem de Clientes");
                        System.out.println("<2> Listagem de Fornecedores");
                        System.out.println("<3> Listagem de Produtos");
                        System.out.println("<4> Listagem de Pedidos");
                        System.out.println("<5> Listagem em um intervalo de datas");
                        System.out.println("<6> Busca de um pedido pelo número");
                        System.out.println("<7> Listagem de todos os pedidos pagos");
                        System.out.println("<8> Busca de de um produto pelo nome deste");
                        System.out.println("<9> Cálculo do total dos pedidos em aberto (não pagos)");
                        System.out.println("<10> Voltar");
                        System.out.println("Digite uma opcao: ");
                        reportOption = inputReport.nextInt();

                        switch (reportOption) {
                            case 1:
                                System.out.println("---------- LISTA DE CLIENTES ----------");
                                System.out.println(manage.printAll());
                                break;
                            case 2:
                                System.out.println("---------- LISTA DE FORNECEDORES --------");
                                for (Provider objProvider : listProviders) {
                                    objProvider.print();
                                }
                                break;
                            case 3:
                                System.out.println("---------- LISTA DE PRODUTOS --------");
                                for (Item objItem : listItens) {
                                    objItem.print();
                                }
                                break;
                            case 4:
                                System.out.println("---------- LISTA DE PEDIDOS --------");
                                manage.printOrders();
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                        }

                    } while (reportOption != 10);
                    break;
            }
        } while (option != 7);
    }
}
