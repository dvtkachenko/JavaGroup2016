package com.brainacad.module2_14.lab.test_generics2;

import java.util.Arrays;

/**
 * Created by Дима on 13.02.2017.
 */
public class MyTestMethod {
    static <T> void calcNum(T[] array, T maxElem) {
        System.out.println("Array values : " + Arrays.toString(array));
        System.out.println(String.format("Number of elements that are greater than %d: %d",
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
            System.out.println(String.format("Sum of elements that are greater than %d: %d:", maxElemInt, sum));
        } else if (array instanceof Double[]) {
            double sum = 0.0;
            for (int i = maxElemInt; i < array.length; i++) {
                sum += (Double) array[i];
            }
            System.out.println(String.format("Sum of elements that are greater than %d: %.2f:", maxElemInt, sum));
        } else {
            System.out.println("Error sum! The array must be Integer or Double type");
        }
    }
}
// lab 2_14_2, 2_14_3
class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,8,9};
        MyTestMethod.calcNum(integers, 3);
        MyTestMethod.calcSum(integers, 3);
        Double[] doubles = {1.2,2.3,3.1,4.7,5.7,7.445,8.123,9.567,10.24};
        MyTestMethod.calcNum(doubles, 5);
        MyTestMethod.calcSum(doubles, 5);
        Long[] longs = {1L, 2L, 3L, 4L, 5L};
        MyTestMethod.calcNum(longs, 4);
        MyTestMethod.calcSum(longs, 4);
    }
}