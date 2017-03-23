package com.brainacad.module3.lab.lab3_1.lab3_1_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by diman on 23.03.2017.
 */

// lab3_1_3
    // string for args
    // input_bin.msg output_bin.msg
    // input.txt output.txt

public class MyFileCopy {
    final static String MY_PATH = "src\\files\\";

    public static void main(String[] args) {
        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        if (args.length == 2) {
            try  {
                inFile = new FileInputStream(MY_PATH + args[0]);
                outFile = new FileOutputStream(MY_PATH + args[1]);

                int c;

                while ((c = inFile.read()) != -1) {
                    outFile.write(c);
                }

            } catch (IOException e) {
                System.out.println("Error copying " + e.getMessage());
            }
            finally {
                try {
                    if (inFile != null) inFile.close();
                    if (outFile != null) outFile.close();
                    System.out.println("File " + args[0] + " has been successful copied to " + args[1]);
                } catch (IOException e) {
                    System.out.println("Error closing files " + e.getMessage());
                }
            }
        } else {
            System.out.println("There aren't enough parameters. Please enter IN and OUT filename !");
        }
    }
}
