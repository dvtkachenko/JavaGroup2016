package com.brainacad.module2_02.lab;

/**
 * Created by Дима on 03.12.2016.
 */
public class Employee {

    public void calcSalary(String name, double ... varargsSalary) {

        System.out.println();
        System.out.println("Name of employee - > " + name);

        double sumSalary = 0.0;

        for (double salary: varargsSalary) {
            sumSalary += salary;
        }

        System.out.println(name + "'s salary is -> " + sumSalary);
    }
}
