package com.brainacad.module2_05.lab;

/**
 * Created by Дима on 20.01.2017.
 */
public class InitTest {
    private int id;

    static private int nextId;

    static {
        nextId = (int)(1000*Math.random());
    }

    {
        nextId++;
        id = nextId;
    }

    public int getId() {
        return id;
    }
}

class Main2 {

    public static void main(String[] args) {
        InitTest initTest1 = new InitTest();
        System.out.println(initTest1.getId());
        InitTest initTest2 = new InitTest();
        System.out.println(initTest2.getId());
        InitTest initTest3 = new InitTest();
        System.out.println(initTest3.getId());
        InitTest initTest4 = new InitTest();
        System.out.println(initTest4.getId());
        InitTest initTest5 = new InitTest();
        System.out.println(initTest5.getId());
    }
}