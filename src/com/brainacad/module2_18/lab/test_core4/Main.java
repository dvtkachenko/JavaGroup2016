package com.brainacad.module2_18.lab.test_core4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Дима on 02.03.2017.
 */

// lab2_18_4

public class Main {
    public static void main(String[] args) {
        String[] programs = {"notepad.exe", "calc.exe", "mspaint.exe", "charmap.exe"};

        try {
            Random random = new Random();
            int index = random.nextInt(4);
            System.out.println("Random choice. I am trying to run " + programs[index] + " application");
            Runtime.getRuntime().exec(programs[index]);
            //
            System.out.println();
            System.out.println("You can run some programm manually for example");
            System.out.println("notepad.exe, calc.exe, mspaint.exe, charmap.exe");
            System.out.println("Enter program's name you want to run : ");
            Scanner getProgram = new Scanner(System.in);
            Runtime.getRuntime().exec(getProgram.nextLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
