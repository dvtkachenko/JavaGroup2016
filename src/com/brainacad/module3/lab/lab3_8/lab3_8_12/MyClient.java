package com.brainacad.module3.lab.lab3_8.lab3_8_12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by diman on 12.04.2017.
 */

// lab3_8_1

public class MyClient implements Runnable {

   private Student std;
   private String host;

   public MyClient(Student std, String host) {
       this.std = std;
       this.host = host;
   }

   @Override
   public void run() {
       try (Socket socket = new Socket(host,9999) ) {
           System.out.println("MyClient socket : " + std.getName() + " -> is created");

           ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
           ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

           oos.writeObject(std);
           oos.flush();

           System.out.println("MyClient : " + std.getName() + " -> is sent to server");

           String response = (String)ois.readObject();

           System.out.println("MyClient : " + std.getName() + " -> response from server = " + response);

           oos.close();
           ois.close();

           System.out.println("MyClient : " + std.getName() + " -> is disconnected");

       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }

    }
}
