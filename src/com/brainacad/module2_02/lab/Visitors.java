package com.brainacad.module2_02.lab;

/**
 * Created by Dima on 06.12.2016.
 */
public class Visitors {

    public static void main(String[] args) {

        Person petrenko = new Person();
        Person tatarkin = new Person();
        Person grigorenko = new Person();
        Person tkachenko = new Person();

        petrenko.setPersonalData("Petr");
        tatarkin.setPersonalData("Andrey","Tatarkin", 39);
        grigorenko.setPersonalData("Ruslan","Grigorenko", 39, "male");
        tkachenko.setPersonalData("Dima", 4756968);


        petrenko.printPerson();
        System.out.println();
        tatarkin.printPerson();
        System.out.println();
        grigorenko.printPerson();
        System.out.println();
        tkachenko.printPerson();
        System.out.println();


    }
}
