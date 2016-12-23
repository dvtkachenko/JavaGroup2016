package com.brainacad.module1_04.lab.lab4_6;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_6 {
    public static void main(String[] args) {

        int a = 0b11001101,
                b = 0b10110101;

        System.out.println("Value of A as a binary : A = " + Integer.toBinaryString(a));
        System.out.println("Value of B as a binary : B = " + Integer.toBinaryString(b));

        System.out.println("Value of A, B as a decimal : A = " + a + "   B = " + b);
        System.out.println("------------------------------------");

        System.out.println("Binary result of bitwise operation A & B = " + Integer.toBinaryString(a & b));
        System.out.println("Decimal result of bitwise operation A & B = " + (a & b));
        System.out.println("------------------------------------");

        System.out.println("Binary result of bitwise operation A | B = " + Integer.toBinaryString(a | b));
        System.out.println("Decimal result of bitwise operation A | B = " + (a | b));
        System.out.println("------------------------------------");

        System.out.println("Binary result of bitwise operation A ^ B = " + Integer.toBinaryString(a ^ b));
        System.out.println("Decimal result of bitwise operation A ^ B = " + (a ^ b));
        System.out.println("------------------------------------");

        System.out.println("Binary result of bitwise operation ~A = " + Integer.toBinaryString(~a));
        System.out.println("Decimal result of bitwise operation ~A = " + (~a));
        System.out.println("------------------------------------");

        System.out.println("Binary result of bitwise operation ~B = " + Integer.toBinaryString(~b));
        System.out.println("Decimal result of bitwise operation ~B = " + (~b));
        System.out.println("------------------------------------");

    }
}
