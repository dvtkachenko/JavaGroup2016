package com.brainacad.module2_15.lab.test_collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Дима on 15.02.2017.
 */

// lab 2_15_1
public class Main {
    public static final int numberOfItems = 25;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        fillOfList(list, numberOfItems);
        printOfList(list);
    }

    public static void fillOfList(List<String> list, int num) {
        for (int i = 0; i < num; i++) {
            list.add("number_" + i);
        }
    }

    public static void printOfList(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
