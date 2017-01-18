package com.brainacad.module2_04.lab;

/**
 * Created by Дима on 18.01.2017.
 */
public class Calculation {

    public static void main(String[] args) {

        int[] testMinArray = {-15, 5, -45, 76, 97, 34, -89, 98, 234, 78, 1, -37};

        int[] testMaxArray = {0, 5, -86, 76, 897, 34, -736, 98, -234, 78, 1, -5, -89};

        System.out.println("Min value in array is " + MyMath.findMin(testMinArray));

        System.out.println("Max value in array is " + MyMath.findMax(testMaxArray));

        System.out.println("Area of circle is " + MyMath.getAreaOfCircle(7.5));

    }
}
