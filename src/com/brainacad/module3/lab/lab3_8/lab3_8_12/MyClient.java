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

   public MyClient(Student std) {
       this.std = std;
   }

   @Override
   public void run() {
       try (Socket socket = new Socket("localhost",256) ) {
           ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
           ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
           System.out.println("Client socket is created");

           oos.writeObject(std);
           oos.flush();
           System.out.println("MyClient is sent to server");

           String response = (String)ois.readObject();

           System.out.println("Response from server = " + response);

           oos.close();
           ois.close();

           System.out.println("MyClient is disconnected");

       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }

    }
}
