package com.brainacad.module2_05.lab;

import java.util.Arrays;

/**
 * Created by Дима on 20.01.2017.
 */
public class MyInit {
//    static int[] arr = new int[10];
  static int[] arr ;

    static {
//  {
        arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = (int)(100*Math.random());
        }
    }

    static void printArray() {
        System.out.println(Arrays.toString(arr));
    }

}

class Main1 {
    public static void main(String[] args) {

        MyInit.printArray();

//    lab2_5_2, lab2_5_3
//        MyInit myInit1 = new MyInit();
//        System.out.println(MyInit.arr);
//        myInit1.printArray();

//        MyInit myInit2 = new MyInit();
//        System.out.println(MyInit.arr);
//        myInit2.printArray();
    }
}