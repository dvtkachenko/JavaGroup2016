package com.brainacad.module3.lab.lab3_8.lab3_8_12;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by diman on 12.04.2017.
 */

// lab3_8_1

public class MyServer implements Runnable {

    private List<Student> users = new ArrayList<>();

    /**  lab3_8_1
    @Override
    public void run() {
        try (ServerSocket listener = new ServerSocket(256)) {
            System.out.println("Server waits");
            Socket socket = listener.accept();
            System.out.println("Server is connected");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            Student std = (Student)ois.readObject();
            System.out.println("Server has read student from MyClient");
            oos.writeObject(std.getName());
            System.out.println("Server has written name of student to MyClient");
            oos.flush();
            oos.close();

            oos.close();
            ois.close();

            System.out.println("Server is disconnected");

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }   */

    // lab3_8_2
    private void init() {
        users.add(new Student("Ivan", "Java SE"));
        users.add(new Student("Tanya", "JavaScript"));
        users.add(new Student("Oleg", "PHP"));
        users.add(new Student("Petr", "C++"));
    }

    // lab3_8_2
    @Override
    public void run() {
        try (ServerSocket listener = new ServerSocket(9999)) {

            System.out.println("Server waits");
            init();

            int threadCounter = 1;

            while (true) {
                Socket socket = listener.accept();
                System.out.println("Server has received request for connect. It is connected");

                new Thread(new ThreadClient(socket, users, threadCounter)).start();
                System.out.println("Serving thread " + threadCounter + " is created by server");
                threadCounter++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
