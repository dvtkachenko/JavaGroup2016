package com.brainacad.module2_04.lab;

import java.util.Arrays;

/**
 * Created by Дима on 18.01.2017.
 */
public class MyMath {

    final static double PI = 3.14;

    static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    static int findMax(int[] array) {
        Arrays.sort(array);
        return array[array.length-1];
    }

    static double getAreaOfCircle(double radius) {
        return PI * radius * radius;
    }

}
