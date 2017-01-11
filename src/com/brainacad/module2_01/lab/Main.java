package com.brainacad.module2_01.lab;

/**
 * Created by Дима on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        // Lab 2_1_3
        Computer[] arrayComp = new Computer[5];

        for (int i = 0; i < arrayComp.length; i++) {

            Computer computer = new Computer();

            computer.setSerialNumber(i + 100201601);
            computer.setManufacturer("Asus");
            computer.setPrice(3000.5F + (int)(Math.random() * 2000));
            computer.setQuantityCPU(2 + (i % 3) * 2);
            computer.setFrequencyCPU(1600 + (int)(Math.random() * 1100));

            arrayComp[i] = computer;
        }

        for (Computer comp : arrayComp) {

            System.out.print(comp.getManufacturer() + "; ");
            System.out.print(comp.getSerialNumber() + "; ");
            System.out.print(comp.getPrice() + "; ");
            System.out.print(comp.getQuantityCPU() + "; ");
            System.out.println(comp.getFrequencyCPU());
        }

        System.out.println("");

        // Lab 2_1_4
        // increasing price  10 %
        for (Computer comp : arrayComp) {
            comp.setPrice((float)(comp.getPrice()*1.1));
        }

        System.out.println("After increasing price  10 %");
        System.out.println("");

        for (Computer comp : arrayComp) {
            System.out.print(comp.getManufacturer() + "; ");
            System.out.print(comp.getSerialNumber() + "; ");
            System.out.print(comp.getPrice() + "; ");
            System.out.print(comp.getQuantityCPU() + "; ");
            System.out.println(comp.getFrequencyCPU());
        }

        // Lab 2_1_5
        // increasing price  10 %

        System.out.println("");
        System.out.println("Printing objects by method view");
        System.out.println("");

        for (Computer comp : arrayComp) {
            comp.view();
        }


    }
}
