package com.brainacad.module2_18.lab.test_core1;

import java.math.BigInteger;
import java.util.Random;

/**
 * Created by Дима on 27.02.2017.
 */

// lab2_18_1
public class Main {
    static BigInteger fact(int n) {
        if (n==1) {
            return BigInteger.ONE;
        } else {
            return fact(n-1).multiply(BigInteger.valueOf(n));
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int range = 10 + rand.nextInt(41);
        System.out.println("Random N -> " + range + " != " + fact(range));
    }
}
