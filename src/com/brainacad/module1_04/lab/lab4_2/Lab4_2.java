package com.brainacad.module1_04.lab.lab4_2;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_2 {
    public static void main(String[] args) {

        int a = 159,
                b = 22,
                add = 0,
                sub = 0,
                div = 0,
                mult = 0,
                mod = 0;

        double div_double, zero_double,
                a_double = 35.45,
                b_double = 7.67,
                mod_double;

        add = a + b;
        sub = a - b;
        div = a/b;
        mult = a * b;
        mod = a % b;

        div_double = a/b;
        mod_double = a_double % b_double;

//        zero_double = a / 0;  с целым нулем дает исключение во время выполнения
        zero_double = a / 0.0;  // деление на вещественный ноль даст бесконечность

        System.out.println("add = " + add);
        System.out.println("sub = " + sub);
        System.out.println("div = " + div);
        System.out.println("mult = " + mult);
        System.out.println("mod = " + mod);
        System.out.println("div_double = " + div_double);
        System.out.println("mod_double = " + mod_double);
        System.out.println("zero_double = " + zero_double);

    }
}
