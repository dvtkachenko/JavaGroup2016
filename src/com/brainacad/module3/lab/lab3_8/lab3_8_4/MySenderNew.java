package com.brainacad.module3.lab.lab3_8.lab3_8_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by diman on 14.04.2017.
 */

// lab3_4_8
// filename from "src\files\" is input_bin.msg
// MySenderNew works properly

public class MySenderNew {
    final static String MY_PATH = "src\\files\\";

    final static String MY_HOME_SERVER_IP = "192.168.1.41";
    final static String LOCALHOST = "localhost";
    final static String HOST = LOCALHOST;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the filename to send from folder 'files' : ");
        String filename = sc.nextLine();

        if (filename != "") {

            try (DatagramSocket senderSocket = new DatagramSocket();
                 FileInputStream inFile = new FileInputStream(MY_PATH + filename);) {

                byte[] buffer = new byte[1];
//                DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(HOST), 9999);

                int counter = 0;
                while (inFile.read(buffer) != -1) {
                    DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(HOST), 9999);
                    senderSocket.send(sendPacket);
                    counter++;
                }

                System.out.println("File has been sent by sender");

            } catch (IOException e) {
                System.out.println("Error sending file " + e.getMessage());
            }
        }
    }
}