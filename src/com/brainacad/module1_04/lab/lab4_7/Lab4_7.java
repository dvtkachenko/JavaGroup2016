package com.brainacad.module1_04.lab.lab4_7;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_7 {

    public static void main(String[] args) {

        boolean cond_1 = true;
        boolean cond_2 = false;

        int a = cond_1 ? 345 :(cond_2 ? 675 : 128);

        System.out.println("Value of cond_1 = " + cond_1 + "  cond_2 = " + cond_2);

        System.out.println("Result of cond_1 ? 345 :(cond_2 ? 675 : 128) = " + a);
        System.out.println("------------------------------------");

        cond_1 = false;
        cond_2 = true;

        a = cond_1 ? 345 :(cond_2 ? 675 : 128);

        System.out.println("Value of cond_1 = " + cond_1 + "  cond_2 = " + cond_2);

        System.out.println("Result of cond_1 ? 345 :(cond_2 ? 675 : 128) = " + a);
        System.out.println("------------------------------------");

    }
}
