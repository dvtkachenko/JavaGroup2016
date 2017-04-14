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
// MyRecipientNew works properly

public class MyRecipientNew {
    final static String MY_PATH = "src\\files\\";

    final static String MY_HOME_SERVER_IP = "192.168.1.41";
    final static String LOCALHOST = "localhost";
    final static String HOST = LOCALHOST;

    public static void main(String[] args) {
        try (DatagramSocket receiveSocket = new DatagramSocket(9999, InetAddress.getByName(HOST));
             FileOutputStream outFile = new FileOutputStream(MY_PATH + "received_file");) {

            System.out.println("Recipient is ready to receive file ... ");

            int count = 0;
            byte[] receiveData = new byte[1];
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                receiveSocket.receive(receivePacket);
                outFile.write(receivePacket.getData());
                outFile.flush();
                count++;
            }

 //           System.out.println("File has been received by recipient");
 //           System.out.println("Recipient has receive " + count + " bytes");

        } catch (IOException e) {
            System.out.println("Error receiving file " + e.getMessage());
        }

    }
}
