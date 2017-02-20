package com.brainacad.module2_16.lab.lab2_16_2;

/**
 * Created by Дима on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        byte b = 5;

        foo(b);

        Byte bb = 10;
        foo(bb);
    }

    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(Byte b) {
        System.out.println("Byte");
    }
}
