package com.brainacad.module2_14.lab.test_generics2;

import java.util.Arrays;

/**
 * Created by Дима on 13.02.2017.
 */
public class MyTestMethod {
    static <T> void calcNum(T[] array, T maxElem) {
        System.out.println("Array values : " + Arrays.toString(array));
        System.out.println(String.format("Number of element that are greater than %d: %d",
                maxElem,
                array.length - (Integer) maxElem));
    }

    static <T> void calcSum(T[] array, T maxElem) {
        System.out.println("Array values : " + Arrays.toString(array));
        int maxElemInt = (Integer) maxElem;
        if (array instanceof Integer[]) {
            int sum=0;
            for (int i = maxElemInt; i < array.length; i++) {
                sum += (Integer) array[i];
            }
            System.out.println(String.format("Sum of element that are greater than "));

            // далее код с фотографии
        }
    }
}
