package com.brainacad.module1_04.lab.lab4_3;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_3 {
    public static void main(String[] args) {

        boolean a = false,
                b = true,
                c = false,
                d = true,
                and_1, and_2, or_1, or_2, not, xor_1, xor_2;

        and_1 = a & b;
        and_2 = b & d;
        or_1 = b | c;
        or_2 = a | c;
        not = !d;
        xor_1 = a ^ b;
        xor_2 = b ^ d;

        System.out.println("---------------------------------------------------------");
        System.out.println("a = " + a + " ; b = " + b + " ; c = " + c + " ; d = " + d);
        System.out.println("---------------------------------------------------------");
        System.out.println("and_1 = a & b = " + and_1);
        System.out.println("and_2 = b & d = " + and_2);
        System.out.println("or_1 = b | c = " + or_1);
        System.out.println("or_2 = a | c = " + or_2);
        System.out.println("not = !d = " + not);
        System.out.println("xor_1 = a ^ b = " + xor_1);
        System.out.println("xor_2 = b ^ d = " + xor_2);

    }
}
