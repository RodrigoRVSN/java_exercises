package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageSubj {
    ArrayList<Teacher> listTeachers = new ArrayList();
    ArrayList<Discipline> listDisciplines = new ArrayList();
    Teacher teacher = new Teacher();

    int optionRegister = 0;
    Scanner inputOption = new Scanner(System.in);

    public void register(){
        System.out.println("------------------------------------------");
        System.out.println("1- Cadastrar professor: ");
        System.out.println("2- Cadastrar disciplina: ");
        optionRegister = inputOption.nextInt();
        inputOption.nextLine();
        if(optionRegister == 1) {
            System.out.println("---------- CADASTRO DE PROFESSOR --------");
            Teacher teacher = new Teacher();

            System.out.println("Digite o nome:");
            teacher.setName(inputOption.nextLine());
            System.out.println("Digite o título:");
            teacher.setTitle(inputOption.nextLine());
            System.out.println("Digite a carga horária:");
            teacher.setWorkload(inputOption.nextInt());
            inputOption.nextLine();

            listTeachers.add(teacher);
        } else {
            System.out.println("---------- CADASTRO DE DISCIPLINA --------");
            Discipline discipline = new Discipline();

            System.out.println("Digite nome:");
            discipline.setName(inputOption.nextLine());
            System.out.println("Digite a carga horária:");
            discipline.setWorkload(inputOption.nextInt());
            inputOption.nextLine();
            System.out.println("Digite o nome do professor:");
            discipline.setTeacher(inputOption.nextLine());

            listDisciplines.add(discipline);
            teacher.addDisciplines(discipline);

        }
    }

    public void checkTeacherToDiscipline(){
        System.out.println("------------------------------------------");
        System.out.println("Digite o nome da disciplina: ");
        String nameOfDiscipline = inputOption.nextLine();
        for(Discipline objDiscipline:listDisciplines){
            if(objDiscipline.getName().equals(nameOfDiscipline)){
                System.out.println("O professor que ministra essa disciplina é: " + objDiscipline.getTeacher());
            }
        }
    }

    public void listTitleTeachers(){
        System.out.println("------------------------------------------");
        System.out.println("Digite o título: ");
        String nameOfTitle = inputOption.nextLine();
        for(Teacher objTeacher:listTeachers){
            if(objTeacher.getTitle().equals(nameOfTitle)){
                System.out.println(objTeacher.getName());
            }
        }
    }

    public void listAllDisciplines(){
        System.out.println("------------------------------------------");
        System.out.println("Digite o nome do professor: ");
        String nameOfTeacher = inputOption.nextLine();
        teacher.listDisciplines(nameOfTeacher, listTeachers);
    }
}
