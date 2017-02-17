package com.brainacad.module2_15.lab.test_my_gen;

import java.util.*;

/**
 * Created by Дима on 17.02.2017.
 */
public class MyNumGenerator {
    // lab 2_15_4
    private int numOfElem, maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List generate() {
        Random random = new Random();

        List list = new ArrayList(numOfElem);
        for (int i = 0; i < numOfElem; i++) {
            list.add(random.nextInt(maxNumb));
        }
        return list;
    }

    // lab 2_15_5
    public Set generateDistinct() {
        if (numOfElem > maxNumb) {
            System.out.println("Impossible to create a set " +
            "(required number more than the number of possible values)");
            return null;
        }

        Random random = new Random();
        Set set = new HashSet(numOfElem);
        for (int i = 0; i < numOfElem; i++) {
            if (!set.add(random.nextInt(maxNumb))) {
                i--;
            }
        }
        return set;
    }
}

class Main {
    public static void main(String[] args) {
        // lab 2_15_4
        System.out.println("Lab 2_15_4");

        MyNumGenerator objectList = new MyNumGenerator(12,20);
        System.out.println("List -> " + objectList.generate());

        // lab 2_15_5
        // try to understand how it works
        System.out.println("Lab 2_15_5");

        MyNumGenerator objectSet = new MyNumGenerator(5, 5);
        System.out.println("Set -> " + objectSet.generateDistinct());
    }
}