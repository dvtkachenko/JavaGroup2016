package com.brainacad.module3.lab.lab3_8.lab3_8_12;

/**
 * Created by diman on 12.04.2017.
 */
// lab3_8_1

public class MainLocalhost {
    public static void main(String[] args) {

        /**  lab3_8_1
        Student student = new Student("Ivan", "Math");

        MyServer myServer = new MyServer();
        Thread threadServer = new Thread(myServer);
        threadServer.start();
        System.out.println("threadServer is started");

        MyClient myClient = new MyClient(student);
        Thread threadClinet = new Thread(myClient);
        threadClinet.start();
        System.out.println("threadClient is started");
         */

        // lab3_8_2
        MyServer myServer = new MyServer();
        Thread threadServer = new Thread(myServer);
        threadServer.start();
        System.out.println("threadServer is started");

        Thread threadClient1 = new Thread(new MyClient(new Student("Ivan", "Java SE"),"localhost"));
        threadClient1.start();
        System.out.println("threadClient1 is started");

        Thread threadClient2 = new Thread(new MyClient(new Student("Anton", "Java SE"),"localhost"));
        threadClient2.start();
        System.out.println("threadClient2 is started");

        Thread threadClient3 = new Thread(new MyClient(new Student("Oleg", "PHP"),"localhost"));
        threadClient3.start();
        System.out.println("threadClient3 is started");

    }
}
