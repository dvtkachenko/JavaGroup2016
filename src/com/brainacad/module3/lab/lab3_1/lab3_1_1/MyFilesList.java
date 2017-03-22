package com.brainacad.module3.lab.lab3_1.lab3_1_1;

import java.io.File;


/**
 * Created by diman on 22.03.2017.
 */

// lab3_1_1
public class MyFilesList {
    public static void main(String[] args) {

        File dir = null;

        if (args.length == 0) {
            dir = new File("c:\\");
            System.out.println("There isn't any args");
            System.out.println("Take files from disk C: ");
        } else {
            System.out.println("We have an args[0]");
            System.out.println("Take parametr from args[0]");
            System.out.println("args[0] = " + args[0]);
            dir = new File(args[0]);
        }

        if (dir.isDirectory()) {
            System.out.println("Directory " + dir.getPath() + " consists next files and directories" );
            File[] fileList = dir.listFiles();
            for(File file : fileList) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println(dir.getName() + " is not a directory !");
        }
    }
}
