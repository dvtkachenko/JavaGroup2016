package com.brainacad.module2_17.lab.test_thread1;

/**
 * Created by Дима on 23.02.2017.
 */

// lab2_17_1
class MyTimeBombThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Number : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom !!!");
    }
}

// lab2_17_2
class MyTimeBombRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Number : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Boom !!!");
    }
}

// lab2_17_1
class MainThread {
    public static void main(String[] args) {
        System.out.println("lab2_17_1 - method main started");
        MyTimeBombThread bombThread = new MyTimeBombThread();
        bombThread.start();
        System.out.println("lab2_17_1 - method main finished");
    }
}

// lab2_17_2
class MainRunnable {
    public static void main(String[] args) {
        System.out.println("lab2_17_2 - method main started");
        MyTimeBombRunnable bombRunnable = new MyTimeBombRunnable();
        Thread thread = new Thread(bombRunnable);
        thread.start();
        System.out.println("lab2_17_2 - method main finished");
    }
}