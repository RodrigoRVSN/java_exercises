package com.company;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private String title;
    private int workload;
    private ArrayList<Discipline> disciplines = new ArrayList<Discipline>();

    public Teacher() {
    }

    public Teacher(String name, String title, int workload) {
        this.name = name;
        this.title = title;
        this.workload = workload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void addDisciplines(Discipline obj) {
        disciplines.add(obj);
    }

    public void listDisciplines(String nameOfTeacher, ArrayList listTeachers) {
        for (Discipline objDiscipline : disciplines) {
            if (objDiscipline.getTeacher().equals(nameOfTeacher)) {
                System.out.println(objDiscipline.getName());
            }
        }
    }
}