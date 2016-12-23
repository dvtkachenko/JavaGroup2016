package com.brainacad.module1_04.lab.lab4_5;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_5 {

    public static void main(String[] args) {

        int a = 400,
                b = 400;

        System.out.println("Value of A BEFORE twice right-shifting = " + Integer.toBinaryString(a) + " as a decimal A = " + a);
        System.out.println("Value of B BEFORE B / 4 = " + Integer.toBinaryString(b) + " as a decimal B = " + b);
        System.out.println();

        System.out.println("Value of A AFTER twice right-shifting = " + Integer.toBinaryString(a >> 2) + " as a decimal A = " + (a >> 2));
        System.out.println("Value of B AFTER B / 4 = " + Integer.toBinaryString(b/4) + " as a decimal B = " + (b/4));

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        System.out.println("Value of A BEFORE twice left-shifting = " + Integer.toBinaryString(a) + " as a decimal A = " + a);
        System.out.println("Value of B BEFORE B * 4 = " + Integer.toBinaryString(b) + " as a decimal B = " + b);
        System.out.println();

        System.out.println("Value of A AFTER twice left-shifting = " + Integer.toBinaryString(a << 2) + " as a decimal A = " + (a << 2));
        System.out.println("Value of B AFTER B * 4 = " + Integer.toBinaryString(b*4) + " as a decimal B = " + (b*4));

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        System.out.println("Value of A BEFORE logic 4 right-shifting = " + Integer.toBinaryString(a) + " as a decimal A = " + a);
        System.out.println();
        System.out.println("Value of A AFTER  logic 4 right-shifting = " + Integer.toBinaryString(a >>> 4) + " as a decimal A = " + (a >>> 4));

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        a = -400;

        System.out.println("Value of A BEFORE logic 4 right-shifting = " + Integer.toBinaryString(a) + " as a decimal A = " + a);
        System.out.println();
        System.out.println("Value of A AFTER  logic 4 right-shifting = " + Integer.toBinaryString(a >>> 4) + " as a decimal A = " + (a >>> 4));

    }
}
