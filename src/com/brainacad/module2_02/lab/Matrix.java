package com.brainacad.module2_02.lab;

import java.util.Arrays;

/**
 * Created by Дима on 03.12.2016.
 */
public class Matrix {

    private boolean checkMatrix(int[][] matr1, int [][] matr2) {

        if(matr1.length != matr2.length)
            return false;
        else {
            int size = matr1.length;

            for (int row = 0; row < size; row++) {
                if (matr1[row].length != size || matr2[row].length != size) {
                    return false;
                }
            }
        }

        return true;
    }

    public void printMatrix(int[][] matr) {

        for (int[] row : matr) {
            System.out.println(Arrays.toString(row));
        }

    }

    public int[][] addMatrix(int[][] matr1, int [][] matr2) {

        if (!checkMatrix(matr1, matr2))
            return null;

        int[][] result = new int[matr1.length][matr1.length];

        for (int i=0; i < result.length; i++) {
            for (int j=0; j < result.length; j++) {
                result[i][j] = matr1[i][j] + matr2[i][j];
            }
        }

        return result;
    }

    public int[][] initMatrix(int size) {

        int [][] matrix = new int[size][size];

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix.length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }

        return matrix;
    }

    public int[][] multMatrix(int[][] matr1, int [][] matr2) {

        if (!checkMatrix(matr1,matr2))
            return null;

        int [][] result = new int[matr1.length][matr1.length];

        for (int i=0; i < result.length; i++) {
            for (int j=0; j < result.length; j++) {
                for (int k =0; k < result.length; k++) {
                    result[i][j] += matr1[i][k] * matr2[k][j];
                }
            }
        }

        return result;
    }

}
