package com.brainacad.module3.lab.lab3_8.lab3_8_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by diman on 14.04.2017.
 */

// lab3_8_5

public class TestURLConnection  {

    public static void printURLInfo(String hostName) throws Exception  {
        URL url = new URL(hostName);

        URLConnection urlCon = url.openConnection();

        InetAddress ip = InetAddress.getByName(new StringBuffer(hostName).substring(7));

        System.out.println("Host name " + ip.getHostName());
        System.out.println("Host address " + ip.getHostAddress());

        System.out.println("Date of response " + urlCon.getDate());

        System.out.println("Type of content " + urlCon.getContentType());

        System.out.println("Expiration date " + urlCon.getExpiration());

        System.out.println("Length of content " + urlCon.getContentLengthLong());

        System.out.println("==========CONTENT=============");

        BufferedReader in = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }

        System.out.println();

    }

    public static void main(String[] args) throws Exception  {

        printURLInfo("http://mainacad.com");
    }
}
