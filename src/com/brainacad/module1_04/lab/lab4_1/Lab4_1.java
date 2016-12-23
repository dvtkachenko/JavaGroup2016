package com.brainacad.module1_04.lab.lab4_1;

/**
 * Created by Дима on 23.12.2016.
 */
public class Lab4_1 {
    public static void main(String[] args) {

        byte bb = 0b01101101;
        short ss = 073;
        int ii = 157;
        long ll = 0x1F4E;
        float ff = -2.3456f;
        double dd = 1.5e-4;
        boolean bool = false;
        char ch_1 = 'D',
                ch_2 = '\u013e';

        System.out.println("Type byte -> " + bb);
        System.out.println("Type short -> " + ss);
        System.out.println("Type int -> " + ii);
        System.out.println("Type long -> " + ll);
        System.out.println("Type float -> " + ff);
        System.out.println("Type double -> " + dd);
        System.out.println("Type boolean -> " + bool);
        System.out.println("Type char -> " + ch_1 + " ; " + ch_2);

    }
}
