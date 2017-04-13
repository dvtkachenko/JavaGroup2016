package com.brainacad.module3.lab.lab3_8.lab3_8_3;

import com.brainacad.module3.lab.lab3_8.lab3_8_12.Student;

import java.io.*;
import java.net.Socket;

/**
 * Created by diman on 13.04.2017.
 */

// lab3_8_3
public class ServerThread extends Thread {

    private static int counterThread = 0;

    private Socket socket;
    private String nameThread;

    public ServerThread(Socket socket) {
        super();
        this.socket = socket;
        counterThread++;
        nameThread = "ServerThread " + counterThread;
    }

    public static int getCounterThread() {
        return counterThread;
    }

    public String getNameThread() {
        return nameThread;
    }

    @Override
    public void run() {
        try (OutputStream out = socket.getOutputStream();
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

//            OutputStream out = socket.getOutputStream();
//            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            System.out.println(nameThread  + " got output and input stream");

            int countMessage = 0;
            while(true) {
                String buf = in.readLine();
                if (buf.equals("END")) break;
                countMessage++;
                out.write("PONG".getBytes());
                out.write("\n".getBytes());
                out.flush();
                System.out.println(nameThread + " PING-PONG " + countMessage);
            }

            counterThread--;
            System.out.println(nameThread + " stopped");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
