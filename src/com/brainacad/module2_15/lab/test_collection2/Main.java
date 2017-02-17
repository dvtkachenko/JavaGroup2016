package com.brainacad.module2_15.lab.test_collection2;

import java.util.*;

/**
 * Created by Дима on 17.02.2017.
 */
// lab 2_15_2
public class Main {
    public static final int numberOfItems = 10;

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        fillOfList(linkedList, numberOfItems);
        printOfList(linkedList);
    }

    public static void fillOfList(List<String> list, int num) {
        Random random = new Random();

        for (int pos = 0; pos < num; pos++) {
            list.add(random.nextInt(pos+1),("num_" + pos));
        }
    }

    public static void printOfList(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
