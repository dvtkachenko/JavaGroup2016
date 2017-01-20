package com.brainacad.module2_05.lab;

/**
 * Created by Дима on 20.01.2017.
 */
public class MyInitTest {

    int test;

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    MyInitTest() {
        this(20);
        System.out.println("Constructor MyInitTest()");
    }

    MyInitTest(int test) {
        System.out.println("Constructor MyInitTest(int test)");
        this.test = test;
    }

}

class Main {
    public static void main(String[] args) {
        System.out.println("Method main");
        MyInitTest myInitTest = new MyInitTest();
    }

}