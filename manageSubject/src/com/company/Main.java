package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int option = 0;
        Scanner inputOption = new Scanner(System.in);
        ManageSubj manageSubject = new ManageSubj();

        do{
            System.out.println("1 - Cadastrar professores e disciplinas");
            System.out.println("2 - Fazer uma busca pelo nome da disciplina e mostrar o professor que ministra a disciplina");
            System.out.println("3 - Buscar por uma titulação e mostrar os professores com a tal titulação");
            System.out.println("4 - Mostrar todas as disciplinas que um professor leciona");
            System.out.println("5 - Sair");
            option = inputOption.nextInt();
            inputOption.nextLine();

            switch(option){
                case 1:
                    manageSubject.register();
                    break;
                case 2:
                    manageSubject.checkTeacherToDiscipline();
                    break;
                case 3:
                    manageSubject.listTitleTeachers();
                    break;
                case 4:
                    manageSubject.listAllDisciplines();
                    break;
                default:
                    break;
            }
        } while (option != 5);
    }
}

