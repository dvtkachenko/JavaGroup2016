package com.brainacad.module2_03.lab;

/**
 * Created by Дима on 06.12.2016.
 */
public class MyWindow {

    private double width = 1.7, height = 1.2;

    private int numberOfGlass = 2;

    private String color = "white";

    private boolean isOpen;

    // lab_2_3_2
    public MyWindow() {
//        this.width = 1.5;
//        this.height = 1.1;
//        this.numberOfGlass = 2;
//        this.color = "brown";
//        this.isOpen = false;
    }


    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    // lab_2_3_3
    public MyWindow(double width, double height) {

        // lab_2_3_3
//        this.width = width;
//        this.height = height;

        // lab_2_3_4
        this(width, height, 3, "red", true);
        System.out.println("Constructor 1");

    }

    // lab_2_3_3
    public MyWindow(double width, double height, int numberOfGlass) {

        // lab_2_3_3
//        this.width = width;
//        this.height = height;
//        this.numberOfGlass = numberOfGlass;

        // lab_2_3_4
        this(width, height, numberOfGlass, "green", true);
        System.out.println("Constructor 2");
    }

    public void printFields() {

        System.out.print("  Width = " + width);
        System.out.print("  Height = " + height);
        System.out.print("  NumberGlass = " + numberOfGlass);
        System.out.print("  Color = " + color);
        System.out.println("  Open = " + isOpen);

    }
}
