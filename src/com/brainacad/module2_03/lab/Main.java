package com.brainacad.module2_03.lab;

/**
 * Created by Дима on 06.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        // lab 2_3_1
        MyWindow myWindow_1 = new MyWindow(1.5, 1.9, 4, "yellow", true);
        MyWindow myWindow_2 = new MyWindow(1.5, 3.9, 2, "black", true);
        MyWindow myWindow_3 = new MyWindow(1.2, 2.4, 3, "white", true);

        myWindow_1.printFields();
        myWindow_2.printFields();
        myWindow_3.printFields();

        // lab 2_3_2

        System.out.println("-------------------------");
        MyWindow window = new MyWindow();
        window.printFields();

        // lab_2_3_3
        System.out.println("-------------------------");
        MyWindow myWin_1 = new MyWindow(2.5, 2);
        MyWindow myWin_2 = new MyWindow(2.5, 2, 3);

        myWin_1.printFields();
        myWin_2.printFields();

        // lab_2_3_5

        System.out.println("-------------------------");
        MyWindow[] windows = {myWin_1, window, myWindow_1};

        for (MyWindow win : windows) {
            win.printFields();
        }

    }
}
