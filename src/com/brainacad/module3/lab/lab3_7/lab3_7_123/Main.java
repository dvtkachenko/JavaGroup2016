package com.brainacad.module3.lab.lab3_7.lab3_7_123;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by diman on 07.04.2017.
 */

// lab3_7_123, lab3_7_2
public class Main {

    // lab3_7_123
    public static Integer[] createArray() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter size of array -> ");

        Random rand = new Random();

        Integer[] arr = new Integer[sc.nextInt()];
        for (int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(100);
        }

        return arr;
    }

    // lab3_7_2
    public static Integer sumSomething(Integer[] arr, Predicate<Integer> predicate) {
        int sum = 0;

        for (Integer num : arr) {
            if (predicate.test(num)) {
                sum += num;
                System.out.print("num = " + num + ", ");
            }
        }
        System.out.println();
        return sum;
    }

    // lab3_7_2
    public static void printStringFilter(List<String> list, Predicate<String> predicate) {
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.println("str " + str );
            }
        }
    }

    // lab3_7_3
    public static void updateList(List<String> list) {
        MyConverter converter = s -> {
            if (!MyConverter.isNull(s))  s = s.toUpperCase();
            return s;
        };

        for (int i = 0; i < list.size() ; i++ ) {
            list.set(i,converter.convertStr(list.get(i)));
        }
    }

    public static void main(String[] args) {
        // lab3_7_123
        Integer[] arr = createArray();

        System.out.println("Array before sort" + Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> b.compareTo(a));
        System.out.println("Array after sort" + Arrays.toString(arr));

        // lab3_7_2
        System.out.println();
        System.out.println("The sum of even numbers");
        System.out.println("sum = " + sumSomething(arr, (p) -> p%2 == 0));

        System.out.println();
        System.out.println("The sum of odd numbers");
        System.out.println("sum = " + sumSomething(arr, (p) -> p%2 != 0));

        System.out.println();
        System.out.println("The sum of numbers where p > 2 && p < 50");
        System.out.println("sum = " + sumSomething(arr, (p) -> (p > 2 && p < 50)));

        System.out.println();
        System.out.println("String which consist letter S");
        List<String> listString = Arrays.asList("Java", "Delphi", "C++", "PHP", "Scala");
        printStringFilter(listString, str -> str.charAt(0) == 'S');

        System.out.println();
        List<String> listStringNew = Arrays.asList("Java", "Delphi", null, "C++", "PHP", "Scala", "", null);
        System.out.println("List of string before uppercase");
        System.out.println(listStringNew.toString());
        System.out.println();
        System.out.println("List of string after uppercase");
        updateList(listStringNew);
        System.out.println(listStringNew.toString());

        System.out.println();
        // these string are equals
        listStringNew.forEach(System.out::println);
        listStringNew.forEach(s -> System.out.println(s));
    }
}
