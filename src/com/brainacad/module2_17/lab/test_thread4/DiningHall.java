package com.brainacad.module2_17.lab.test_thread4;

/**
 * Created by Дима on 23.02.2017.
 */

// lab2_17_6
public class DiningHall {
    static int pizzaNum;
    static int counter;

    public void makePizza() {
        pizzaNum++;
        counter++;
    }

    public String servePizza() {
        String result;
        if (pizzaNum > 0) {
            result = "pizza served ";
            pizzaNum--;
        } else result = " starved ";
        return result;
    }
}

class Student extends Thread {
    DiningHall dh;
    String myName;

    boolean iTriedGetPizza = false;

    public Student(DiningHall dh, String myName) {
        this.dh = dh;
        this.myName = myName;
    }

    @Override
    public void run() {
        System.out.println("Student " + myName + " thread started");
        synchronized (dh) {
            while (!iTriedGetPizza) {
                if (dh.counter >= 10) {
                    System.out.println("Student " + myName + " tried getting pizza - " +
                            dh.servePizza() + "  - pizzaNum = " + dh.pizzaNum);
                    iTriedGetPizza = true;
                }
            }
       }
    }
}

// lab 2_17_6
class Main {
    public static void main(String[] args) {
        DiningHall dh = new DiningHall();
        Student[] students = new Student[20];

        for (int i = 0; i < 20; i++) {
            students[i] = new Student(dh, (i+1) + " ");
            students[i].start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Pizzas are being served");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            dh.makePizza();
        }

    }
}