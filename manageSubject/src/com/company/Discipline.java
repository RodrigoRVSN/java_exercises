package com.company;

public class Discipline {
    private String name;
    private int workload;
    private String teacher;

    public Discipline() {
    }

    public Discipline(String name, int workload, String teacher) {
        this.name = name;
        this.workload = workload;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
