package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person lPerson = new Person();
        int proceed = 0, i;

        while (proceed == 0) {
            Person person = new Person();
            person.setSex(JOptionPane.showInputDialog("Type your sex:\n1) 'M' - Masculine\n2) 'F' - Feminine").charAt(0));
            person.setAge(Integer.parseInt(JOptionPane.showInputDialog("Type our age: ")));
            person.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Type your height:")));
            person.setEyeColor(JOptionPane.showInputDialog("Type color of your eyes:\n1) 'B' - Blue\n2) 'G' - Green\n2) 'N' - Nut Brown").charAt(0));

            lPerson.add(person);
            proceed = JOptionPane.showConfirmDialog(null, "You want to continue?", "WARNING", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null,
                "Average ages with brown eyes and height > 1,60: " +
                        lPerson.averageAge() +
                        "\nOlder age: " + lPerson.olderAge() +
                        "\nMens percent: " + lPerson.manPercentage()  + " %" +
                        "\nFemales with age > 20 & < 45 green eyes: " + lPerson.countFemales()
        );
    }
}
