package com.brainacad.module3.lab.lab3_6.lab3_6_1;

/**
 * Created by diman on 03.04.2017.
 */
// lab3_6_1
public class Main {
    @Deprecated
//    @SuppressWarnings("deprecation")
    public static int findMax(int ... args) {
        int max = args[0];
        for (int num : args) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }
    @SafeVarargs
    public static <T extends Number> T findMax(T ... args) {
        T max = args[0];
        for (T num : args) {
            if (max.doubleValue() < num.doubleValue()) {
                max = num;
            }
        }
        return max;
    }


    //        @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        int[] arr = {3,6,1,67,45,89,23,74,12,42};

        System.out.print("Array = ");
        for(int num:arr) {
            System.out.print(" " + num);
        }
        System.out.println();
        System.out.println("max element is " + findMax(arr));
    }
}
