package com.brainacad.module2_16.lab.lab2_16_4;

/**
 * Created by Дима on 20.02.2017.
 */

class Animal {};

class Dog extends Animal {};

class Puppy extends Dog {};

public class Main {
    public static void main(String[] args) {

        System.out.println("foo(null)");
        foo(null);
        System.out.println();

        System.out.println("Puppy puppy = null");
        Puppy puppy = null;
        foo(puppy);
        System.out.println();

        System.out.println("Animal animal = null");
        Animal animal = null;
        foo(animal);
        System.out.println();

        System.out.println("Dog dog = null");
        Dog dog = null;
        foo(dog);
        System.out.println();

        // it does not work ... because it can not narrow type Object
        System.out.println("Object obj = null");
        Object obj = null;
//        foo(obj);
        System.out.println();


    }

    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void foo(Puppy p) {
        System.out.println("Puppy");
    }

}
