package com.brainacad.module3.lab.lab3_8.lab3_8_4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by diman on 14.04.2017.
 */

// lab3_8_4
// MyRecipient is only for experiment, it does not work properly

public class MyRecipient {
    final static String MY_PATH = "src\\files\\";

    final static String MY_HOME_SERVER_IP = "192.168.1.41";
    final static String LOCALHOST = "localhost";
    final static String HOST = LOCALHOST;

    public static void main(String[] args) {
        try (DatagramSocket receiveSocket = new DatagramSocket(9999, InetAddress.getByName(HOST));
             FileOutputStream outFile = new FileOutputStream(MY_PATH + "received_file");) {

            System.out.println("Recipient is ready to receive file ... ");

            byte[] receiveData = new byte[1];
            int counter = 0;
            DatagramPacket receivePacket = new DatagramPacket(receiveData, 1);
            do {
                receiveSocket.receive(receivePacket);
                outFile.write(receivePacket.getData());
                counter++;
                if ((int)receivePacket.getData()[0] == -1) break;
//                outFile.write(receivePacket.getData());
                counter++;
            } while(true);

            System.out.println("File has been received by recipient");
            System.out.println("Recipient has read " + counter + " bytes");

        } catch (IOException e) {
            System.out.println("Error receiving file " + e.getMessage());
        }

    }
}
