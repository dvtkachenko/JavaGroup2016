package com.brainacad.module3.lab.lab3_1.lab3_1_2;

import java.io.File;
import java.io.IOException;

/**
 * Created by diman on 22.03.2017.
 */

// lab3_1_2
public class PrintFile {
    public static void main(String[] args) {
        File file = null;

        if (args.length != 0) {
            file = new File(args[0]);
            if (file.isFile()) {
                try () {

                } catch (IOException e) {
                    System.out.println("Error reading file ! " + e.getMessage());
                }
            } else {
                System.out.println("args[0] is not a filename ! Please enter filename !");
            }
        } else {
            System.out.println("There aren't any args ! Please enter parameter !");
        }
    }
}
