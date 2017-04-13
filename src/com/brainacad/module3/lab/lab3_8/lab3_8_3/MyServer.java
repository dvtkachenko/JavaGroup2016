package com.brainacad.module3.lab.lab3_8.lab3_8_3;

import com.brainacad.module3.lab.lab3_8.lab3_8_12.ThreadClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by diman on 13.04.2017.
 */
// lab3_8_3

public class MyServer {

    public static void handlingQuery() {
        try (ServerSocket listener = new ServerSocket(9999)) {

            System.out.println("Server waits");

            while (true) {
                Socket socket = listener.accept();
                System.out.println("Server has received request for connect. It is connected");

                new ServerThread(socket).start();
                System.out.println("ServerThread " + ServerThread.getCounterThread() + " is created by server");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        handlingQuery();
    }
}
