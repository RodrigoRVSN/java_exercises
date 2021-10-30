package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputOption = new Scanner(System.in);
        Scanner inputReport = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        ArrayList<Customer> listCustomers = new ArrayList();
        ArrayList<Provider> listProviders = new ArrayList();
        ArrayList<Item> listItens = new ArrayList();


        int option = 0, reportOption = 0;

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
                    Customer cust = new Customer();
                    System.out.println("Digite nome:");
                    cust.setName(input.nextLine());
                    System.out.println("Digite e-mail:");
                    cust.setEmail(input.nextLine());
                    System.out.println("Digite 'PF' para pessoa física e 'PJ' para jurídica:");
                    cust.setTypePerson(input.nextLine());
                    if(cust.getTypePerson().equalsIgnoreCase("pf")){
                        System.out.println("Digite o CPF:");
                        cust.setCpf(input.nextLine());
                        System.out.println("Digite a quantidade máxima de parcelamento:");
                        cust.setInstallmentAmount(input.nextInt());
                    } else {
                        System.out.println("Digite o CNPJ:");
                        cust.setCnpj(input.nextLine());
                        System.out.println("Digite o prazo máximo de faturamento:");
                        cust.setBillingTerm(input.nextInt());
                    }
                    input.nextLine();
                    listCustomers.add(cust);
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
                        System.out.println("------------------------");

                        switch (reportOption){
                            case 1:
                                System.out.println("---------- CLIENTES --------");
                                for(Customer objCustomer : listCustomers) {
                                    objCustomer.print();
                                }
                                break;
                            case 2:
                                System.out.println("---------- FORNECEDORES --------");
                                for(Provider objProvider : listProviders) {
                                    objProvider.print();
                                }
                                break;
                            case 3:
                                System.out.println("---------- PRODUTOS --------");
                                for(Item objItem : listItens) {
                                    objItem.print();
                                }
                                break;
                            case 4:
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
