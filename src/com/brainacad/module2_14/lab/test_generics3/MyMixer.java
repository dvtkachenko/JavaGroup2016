package com.brainacad.module2_14.lab.test_generics3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Дима on 17.02.2017.
 */
public class MyMixer<T> {
    private T[] array;

    public MyMixer(T[] array) { this.array = array;}

    public T[] shuffle() {
        Random random = new Random();

        for (int i=0; i<array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            T temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }
        return array;
    }
}
// lab 2_14_4
class Main {
    public static void main(String[] args) {
        Double[] arrDouble = {-7.9, 12.6, -4.8, -3.4, 15.9, 9.3, 19.1};
        MyMixer<Double> mixer_1 = new MyMixer<>(arrDouble);
        System.out.println("Original array : " + Arrays.toString(arrDouble));
        System.out.println("Mixered array : " + Arrays.toString(mixer_1.shuffle()));
        System.out.println();

        String[] arrString = {"one","two","three","four","five","six","seven","eight","nine","ten"};
        MyMixer<String> mixer_2 = new MyMixer<>(arrString);
        System.out.println("Original array : " + Arrays.toString(arrString));
        System.out.println("Mixered array : " + Arrays.toString(mixer_2.shuffle()));
        System.out.println();
    }
}