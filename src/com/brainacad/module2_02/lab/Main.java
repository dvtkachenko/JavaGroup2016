package com.brainacad.module2_02.lab;

/**
 * Created by Дима on 03.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        /**
        Matrix matrix = new Matrix();

        final int SIZE = 2;

        int[][] matr_1, matr_2, addMatr, multMatr;

        matr_1 = matrix.initMatrix(SIZE);
        matr_2 = matrix.initMatrix(SIZE);

        System.out.println();
        System.out.println("Matrix 1 [" + matr_1.length + "][" + matr_1.length + "]");
        System.out.println();
        matrix.printMatrix(matr_1);

        System.out.println();
        System.out.println("Matrix 2 [" + matr_2.length + "][" + matr_2.length + "]");
        System.out.println();
        matrix.printMatrix(matr_2);

        addMatr = matrix.addMatrix(matr_1, matr_2);

        System.out.println();
        System.out.println("Add result matrix [" + addMatr.length + "][" + addMatr.length + "]");
        System.out.println();
        matrix.printMatrix(addMatr);

        multMatr = matrix.multMatrix(matr_1, matr_2);

        System.out.println();
        System.out.println("Multiply result matrix [" + multMatr.length + "][" + multMatr.length + "]");
        System.out.println();
        matrix.printMatrix(multMatr);

  */
        SquareCalculating sc = new SquareCalculating();

        sc.calcSquare(3.5);
        sc.calcSquare(5, 8);
        sc.calcSquare(8);

    }

}
