package com.brainacad.module2_14.lab.test_generics1;

/**
 * Created by Дима on 13.02.2017.
 */
public class MyTuple<A,B,C> {
    private A a;
    private B b;
    private C c;

    public MyTuple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "MyTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        MyTuple myTuple = new MyTuple<String, Integer, Long>("Test",328474,9821982198L);

        System.out.println(myTuple);

        MyTuple<? extends Number, String, String> myTuple1 = new MyTuple<>(3636.837, "test1", "test2");
        MyTuple<? extends Number, String, String> myTuple2 = new MyTuple<>(3636, "test1", "test2");
        MyTuple<? extends Number, String, String> myTuple3 = new MyTuple<>(3636.837f, "test1", "test2");

        System.out.println(myTuple1);
        System.out.println(myTuple2);
        System.out.println(myTuple3);

    }
}