package com.brainacad.module3.lab.lab3_1.lab3_1_2;

import java.io.*;

/**
 * Created by diman on 22.03.2017.
 */

// lab3_1_2
//  parameter args[0] for IntelliJ IDEA
//  "src\files\temp.txt"
public class PrintFile {
    public static void main(String[] args) {
        File file = null;

        if (args.length != 0) {
            file = new File(args[0]);
            if (file.isFile()) {
                try (BufferedReader bufFile = new BufferedReader(new FileReader(file))) {
                    String bufString;
                    while((bufString = bufFile.readLine()) != null) {
                        System.out.println(bufString);
                    }
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
