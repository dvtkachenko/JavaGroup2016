package com.brainacad.module3.lab.lab3_8.lab3_8_12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

/**
 * Created by diman on 12.04.2017.
 */

// lab3_8_2
public class ThreadClient implements Runnable {

    private Socket socket;
    private List<Student> users;
    private int indexOfThread;

    public ThreadClient(Socket socket, List<Student> users, int indexOfThread) {
        this.socket = socket;
        this.users = users;
        this.indexOfThread = indexOfThread;
    }

    @Override
    public void run() {
        try  {
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            System.out.println("Server:threadServiceClient " + indexOfThread + " -> Client socket " + indexOfThread + " is created by server");

            Student std = (Student)ois.readObject();
            System.out.println("Server:threadServiceClient " + indexOfThread + " has read student " + std.getName() + " from MyClient");

            if (users.contains(std)) {
                oos.writeObject("Msg from Server:threadServiceClient " + indexOfThread + " -> Student " + std.getName() + " has permission");
            } else {
                oos.writeObject("Msg from Server:threadServiceClient " + indexOfThread + " -> Student " + std.getName() + " has no permission");
            }

            System.out.println("Server:threadServiceClient " + indexOfThread + " has responded to client");

            oos.flush();
            oos.close();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
