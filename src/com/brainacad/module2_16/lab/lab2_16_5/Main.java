package com.brainacad.module2_16.lab.lab2_16_5;

/**
 * Created by Дима on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        byte b = 5;

        foo(b);

        foo(5);

        Byte bb = 12;
        foo(bb);

        Integer ii = 123;
        foo(ii);


        Number nn = 25;
//        foo(nn);

    }

    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(byte b) {
        System.out.println("byte");
    }

}
