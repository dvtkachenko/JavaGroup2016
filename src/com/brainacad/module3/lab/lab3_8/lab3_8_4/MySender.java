package com.brainacad.module3.lab.lab3_8.lab3_8_4;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by diman on 14.04.2017.
 */

// lab3_4_8
// filename from "src\files\" is input_bin.msg or input.txt
// MySender is only for experiment, it does not work properly

public class MySender {
    final static String MY_PATH = "src\\files\\";

    final static String MY_HOME_SERVER_IP = "192.168.1.41";
    final static String LOCALHOST = "localhost";
    final static String HOST = LOCALHOST;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the filename to send from folder 'files' : ");
        String filename = sc.nextLine();

        if (filename != "") {

//            try (DatagramSocket senderSocket = new DatagramSocket(9999, InetAddress.getByName(HOST));
            try (DatagramSocket senderSocket = new DatagramSocket();
                 FileInputStream inFile = new FileInputStream(MY_PATH + filename);) {

                int c;
                byte[] sendData = new byte[1];
                int counter = 0;

                DatagramPacket sendPacket = new DatagramPacket(sendData, 1, InetAddress.getByName(HOST), 9999);
                do {
                    c = inFile.read();
                    sendData[0] = (byte)c;
                    senderSocket.send(sendPacket);
                    counter++;
                } while (c != -1);

                System.out.println("File has been sent by sender");
                System.out.println("Sender has sent " + counter + " bytes");

            } catch (IOException e) {
                System.out.println("Error sending file " + e.getMessage());
            }
        }
    }
}