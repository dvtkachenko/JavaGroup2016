package com.brainacad.module3.lab.lab3_8.lab3_8_12;

/**
 * Created by diman on 12.04.2017.
 */
// lab3_8_1
// test for separated computers

public class MainForServer {
    public static void main(String[] args) {

        // lab3_8_2
        MyServer myServer = new MyServer();
        Thread threadServer = new Thread(myServer);
        threadServer.start();
        System.out.println("threadServer is started");

    }
}
