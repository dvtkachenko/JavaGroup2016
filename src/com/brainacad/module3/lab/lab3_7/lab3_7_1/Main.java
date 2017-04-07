package com.brainacad.module3.lab.lab3_7.lab3_7_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by diman on 07.04.2017.
 */
public class Main {
    public static Integer[] createArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of array -> ");

        Random rand = new Random();

        Integer[] arr = new Integer[sc.nextInt()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt()*100;
        }

        return arr;
    }

    public static void main(String[] args) {

        Integer[] arr = createArray();

        System.out.println("Array before sort" + Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
        System.out.println("Array after sort" + Arrays.toString(arr));

    }
}
