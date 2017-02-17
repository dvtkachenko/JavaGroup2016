package com.brainacad.module2_15.lab.test_collection3;

import java.util.*;

/**
 * Created by Дима on 17.02.2017.
 */
// lab 2_15_3
public class Main {
    public static final int numberOfItems = 10;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        fillOfList(list, numberOfItems);
        fillOfList(linkedList, numberOfItems);

        printOfList(list);
        System.out.println();
        printOfList(linkedList);
        System.out.println();

        Random random = new Random();
        // try inserting randomly

        ListIterator<String> li = list.listIterator();
        while(li.hasNext()) {
            linkedList.add(li.next());
            linkedList.add(random.nextInt(linkedList.size()),li.next());
        }
        printOfList(linkedList);
        System.out.println();

        // try inserting by something order
        int offset = 0;
        int size = linkedList.size();
        while(li.hasPrevious()) {
            linkedList.add(size - offset++,li.previous());
//            linkedList.add(random.nextInt(linkedList.size()),li.previous());
        }
        printOfList(linkedList);
        System.out.println();

    }

    public static void fillOfList(List<String> list, int num) {
        for (int i = 0; i < num; i++) {
            list.add("num_" + i);
        }
    }

    public static void printOfList(List<String> list) {
        Iterator<String> iterator = list.iterator();

        System.out.print("Name of object : " + list.getClass() + " = {");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(" }");
    }
}

