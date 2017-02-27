package com.brainacad.module2_17.lab.test_thread4;

/**
 * Created by Дима on 23.02.2017.
 */

// lab2_17_6
public class DiningHall { 
            static int pizzaNum; 
            static int studentID = 1; 
         
            public void makePizza() { 
        pizzaNum++; 
    } 
            public void servePizza() { 
        String result; 
        if (pizzaNum > 0) { 
            result = "Served "; 
            pizzaNum--; 
        } else result = "Starved "; 
        System.out.println(result + studentID); 
        studentID++; 
    } 
            public static void main(String[] args) { 
        DiningHall d = new DiningHall(); 
        for (int i = 0; i < 10; i++) 
            d.makePizza(); 
        for (int i = 1; i <= 20; i++) 
            d.servePizza(); 
    } 
}

class Main {
    public static void main(String[] args) {

    }
}