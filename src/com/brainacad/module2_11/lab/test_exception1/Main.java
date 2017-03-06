package com.brainacad.module2_11.lab.test_exception1;

/**
 * Created by Дима on 06.03.2017.
 */

// lab2_11_1
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Test throw exception");
        } catch (Exception e) {
            System.out.println("Catched message is -> " + e.getMessage());;
        }
        finally {
            System.out.println("Do finally action");
        }
    }
}
