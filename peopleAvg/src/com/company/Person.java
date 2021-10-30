package com.company;

import java.util.ArrayList;

public class Person {
    private char sex;
    private double height;
    private int age;
    private char eyeColor;
    private ArrayList<Person> zPerson = new ArrayList<Person>();

    public Person() {
    }

    public Person(char sex, double height, int age, char eyeColor) {
        this.sex = sex;
        this.height = height;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(char eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void add(Person obj) {
        zPerson.add(obj);
    }

    public double averageAge() {
        double sumAge = 0;
        int countAge = 0;
        for (Person objPerson : zPerson) {
            if ((objPerson.getEyeColor() == 'N' || objPerson.getEyeColor() == 'n') && objPerson.getHeight() > 1.6) {
                countAge++;
                sumAge += objPerson.getAge();
            }
            objPerson.getAge();
        }
        return sumAge / countAge;
    }

    public int olderAge() {
        int olderAge = zPerson.get(0).getAge(), i = 0;
        for (Person objPerson : zPerson) {
            if (objPerson.getAge() > olderAge) {
                olderAge = objPerson.getAge();
            }
        }
        return olderAge;
    }

    public double manPercentage() {
        double countMan = 0;
        for (Person objPerson : zPerson) {
            if ((objPerson.getSex() == 'M' || objPerson.getSex() == 'm')) {
                countMan++;
            }


        return countMan / zPerson.size() * 100;
    }

    public int countFemales() {
        int countFemale = 0, i;
        for (Person objPerson : zPerson) {
            if (objPerson.getAge() > 20 && objPerson.getAge() < 45 && (objPerson.getEyeColor() == 'G' || objPerson.getEyeColor() == 'g')) {
                countFemale++;
            }
        }
        return countFemale;
    }
}
