package com.brainacad.module3.lab.lab3_8.lab3_8_3;

import java.io.*;
import java.net.Socket;

/**
 * Created by diman on 13.04.2017.
 */

// lab3_8_3
public class MyClient {

    final static String MY_HOME_SERVER_IP = "192.168.1.41";
    final static String LOCALHOST = "localhost";
    final static String HOST = LOCALHOST;

    public static void exchangeData() {
        try (Socket socket = new Socket(HOST,9999);
             OutputStream out = socket.getOutputStream();
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            System.out.println("Client socket is created");

//            OutputStream out = socket.getOutputStream();
//            InputStream is = socket.getInputStream();

//            byte[] buf = "PING".getBytes();
            for (int i = 0; i < 10 ; i++) {

                out.write("PING".getBytes());
                out.write("\n".getBytes());
                out.flush();

                System.out.println("Client sent PING " + i + " to server");
                System.out.println("Client received " + in.readLine() + " from server");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }

            out.write("END".getBytes());
            out.write("\n".getBytes());
            out.flush();

            System.out.println("client sent messages to server and receive responses");
            System.out.println("client is disconnected");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        exchangeData();
    }
}
