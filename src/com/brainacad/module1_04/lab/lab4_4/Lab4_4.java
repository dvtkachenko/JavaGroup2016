package com.brainacad.module1_04.lab.lab4_4;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_4 {

    public static void main(String[] args) {

        int inc = 5,
                dec = 10,
                result = 0;

        System.out.println("Value of inc BEFORE ++inc = " + inc);
        System.out.println("Value of inc DURING ++inc = " + ++inc);
        System.out.println("Value of inc AFTER ++inc = " + inc);

        System.out.println("------------------------------------");

        System.out.println("Value of inc BEFORE inc++ = " + inc);
        System.out.println("Value of inc DURING inc++ = " + inc++);
        System.out.println("Value of inc AFTER inc++ = " + inc);

        System.out.println("------------------------------------");

        System.out.println("Value of inc BEFORE --dec = " + dec);
        System.out.println("Value of inc DURING --dec = " + --dec);
        System.out.println("Value of inc AFTER --dec = " + dec);

        System.out.println("------------------------------------");

        System.out.println("Value of inc BEFORE dec-- = " + dec);
        System.out.println("Value of inc DURING dec-- = " + dec--);
        System.out.println("Value of inc AFTER dec-- = " + dec);

        System.out.println("------------------------------------");

        System.out.println("Value of result BEFORE -> result = dec-- + --dec + ++inc - inc-- - inc-- = ");
        System.out.println("result = " + result + "  inc = " + inc + "  dec = " + dec);

        result = dec-- + --dec + ++inc - inc-- - inc-- ;

        System.out.println();
        System.out.println("Value of result BEFORE -> result = dec-- + --dec + ++inc - inc-- - inc-- = ");
        System.out.println("result = " + result + "  inc = " + inc + "  dec = " + dec);

    }
}
