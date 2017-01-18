package com.brainacad.module2_04.lab;

/**
 * Created by Дима on 18.01.2017.
 */
public class MyCalc {

    public static double calcPI(int n) {

        double result = 0;
        int count = 0;
        for (double i = 1; i < n; i+=2) {
            count++;
            result += (count % 2 == 0) ? -4/i : 4/i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calcPI(50000));
    }
}
