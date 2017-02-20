package com.brainacad.module2_16.lab.lab2_16_3;

/**
 * Created by Дима on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {

        foo(2,6);
        foo(2,6,14);
        foo(new int[] {2,7,4,0,5,1,3});
        foo(new int[] {});
        foo();

        int[] arr = new int[10];
        foo(arr);

    }

    public static void foo(int a, int b) {
        System.out.println("foo(int a, int b)");
        System.out.println("a = " + a + " b = " + b);
        System.out.println();
    }

    public static void foo(int ... a) {

        System.out.print("Varargs : ");
        for(int i : a) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
