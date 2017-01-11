package com.brainacad.module2_02.lab;

/**
 * Created by Дима on 06.12.2016.
 */
public class SquareCalculating {

    public void calcSquare(final int Length, final int Height) {

        System.out.println("Square rectangle -> " + Length*Height);
    }

    public void calcSquare(final int lengthSide) {

        System.out.println("Square -> " + lengthSide*lengthSide);
    }

    public void calcSquare(final double radius) {

        System.out.println("Circle square -> " + Math.PI*radius*radius);
    }


}
