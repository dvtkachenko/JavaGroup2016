package com.brainacad.module2_02.lab;

/**
 * Created by Дима on 03.12.2016.
 */
public class Accountant {

    public static void main (String[] args) {

        Employee petrenko = new Employee();
        Employee tatarkin = new Employee();
        Employee grigorenko = new Employee();
        Employee tkachenko = new Employee();

        petrenko.calcSalary("Petrenko",3465.67, 36736.78, 5364.86, 9687.67 );
        tatarkin.calcSalary("Tatarkin",124.67, 8766.78, 234.86, 678.67, 456.98, 462.08 );
        grigorenko.calcSalary("Grigorenko",34765.67, 36736.78);
        tkachenko.calcSalary("Tkachenko",34765.67, 36736.78, 3465.67, 36736.78, 5364.86);

    }
}
