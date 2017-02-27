package com.brainacad.module2_17.lab.test_deadlock1;

/**
 * Created by Дима on 27.02.2017.
 */

// lab 2_17_9
class MyObject {};

class MyThread1 extends Thread {

    MyObject myObj1;
    MyObject myObj2;
    MyObject myObj3;

    public MyThread1(MyObject myObj1, MyObject myObj2, MyObject myObj3) {
        this.myObj1 = myObj1;
        this.myObj2 = myObj2;
        this.myObj3 = myObj3;
    }

    @Override
    public void run() {
        synchronized (myObj1) {
            System.out.println("Thread 1 : Holding lock myObj1 ... ");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {}

            System.out.println("Thread 1 : Waiting for lock myObj2 ... ");
            synchronized (myObj2) {
                System.out.println("Thread 1 : Holding lock myObj1 & myObj2 ... ");
            }

            System.out.println("Thread 1 : Waiting for lock myObj3 ... ");
            synchronized (myObj3) {
                System.out.println("Thread 1 : Holding lock myObj1 & myObj3 ... ");
            }

        }
    }
}

class MyThread2 extends Thread {

    MyObject myObj1;
    MyObject myObj2;
    MyObject myObj3;

    public MyThread2(MyObject myObj1, MyObject myObj2, MyObject myObj3) {
        this.myObj1 = myObj1;
        this.myObj2 = myObj2;
        this.myObj3 = myObj3;
    }

    @Override
    public void run() {
        synchronized (myObj2) {
            System.out.println("Thread 2 : Holding lock myObj2 ... ");
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {}

            System.out.println("Thread 2 : Waiting for lock myObj1 ... ");
            synchronized (myObj1) {
                System.out.println("Thread 2 : Holding lock myObj2 & myObj1 ... ");
            }

            System.out.println("Thread 2 : Waiting for lock myObj3 ... ");
            synchronized (myObj3) {
                System.out.println("Thread 2 : Holding lock myObj2 & myObj3 ... ");
            }
        }
    }
}

class MyThread3 extends Thread {

    MyObject myObj1;
    MyObject myObj2;
    MyObject myObj3;

    public MyThread3(MyObject myObj1, MyObject myObj2, MyObject myObj3) {
        this.myObj1 = myObj1;
        this.myObj2 = myObj2;
        this.myObj3 = myObj3;
    }

    @Override
    public void run() {
        synchronized (myObj3) {
            System.out.println("Thread 3 : Holding lock myObj3 ... ");
            try {
                Thread.sleep(15);
            }
            catch (InterruptedException e) {}

            System.out.println("Thread 3 : Waiting for lock myObj2 ... ");
            synchronized (myObj2) {
                System.out.println("Thread 3 : Holding lock myObj3 & myObj2 ... ");
            }

            System.out.println("Thread 3 : Waiting for lock myObj1 ... ");
            synchronized (myObj1) {
                System.out.println("Thread 3 : Holding lock myObj3 & myObj1 ... ");
            }
        }
    }
}

// lab 2_17_9
public class Main {
    public static void main(String[] args) {

        MyObject myObj1 = new MyObject();
        MyObject myObj2 = new MyObject();
        MyObject myObj3 = new MyObject();

        MyThread1 myThread1 = new MyThread1(myObj1, myObj2, myObj3);
        MyThread2 myThread2 = new MyThread2(myObj1, myObj2, myObj3);
        MyThread3 myThread3 = new MyThread3(myObj1, myObj2, myObj3);

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
