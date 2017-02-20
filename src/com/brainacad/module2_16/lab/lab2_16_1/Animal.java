package com.brainacad.module2_16.lab.lab2_16_1;

/**
 * Created by Дима on 20.02.2017.
 */
public class Animal {
}

class Dog extends Animal {

}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);

        Dog d = new Dog();
        foo(d);
    }

    public static void foo(Animal a) {
        System.out.println("Animal");
    }
    public static void foo(Dog d) {
        System.out.println("Dog");
    }
}