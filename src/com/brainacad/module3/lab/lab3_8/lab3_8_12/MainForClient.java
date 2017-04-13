package com.brainacad.module3.lab.lab3_8.lab3_8_12;

/**
 * Created by diman on 12.04.2017.
 */
// lab3_8_1
// test for separated computers

public class MainForClient {
    final static String MY_HOME_SERVER_IP = "192.168.1.41";

    public static void main(String[] args) {

        Thread threadClient1 = new Thread(new MyClient(new Student("Ivan", "Java SE"), MY_HOME_SERVER_IP));
        threadClient1.start();
        System.out.println("threadClient1 is started");

        Thread threadClient2 = new Thread(new MyClient(new Student("Anton", "Java SE"), MY_HOME_SERVER_IP));
        threadClient2.start();
        System.out.println("threadClient2 is started");

        Thread threadClient3 = new Thread(new MyClient(new Student("Oleg", "PHP"), MY_HOME_SERVER_IP));
        threadClient3.start();
        System.out.println("threadClient3 is started");

    }
}
