package com.brainacad.module2_17.lab.test_thread2;

import java.util.Random;

/**
 * Created by Дима on 23.02.2017.
 */

// THERE IS lab2_17_3 and lab2_17_4 IN THIS FILE

// lab2_17_3
class MySumCountThread extends Thread {
    private int startIndex, stopIndex;

    private int[] arrInt;

    private long resultSum = 0;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {

        System.out.print("[");

        for (int i = startIndex; i <= stopIndex; i++ ) {

            if (((i-startIndex)%20 == 0) && (i != startIndex)) System.out.println();

            if (i != stopIndex) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.print(arrInt[i]);
            }

            resultSum += arrInt[i];
        }
        System.out.println("]");
        System.out.println("Sum of array elements : " + resultSum);
    }
}

// lab2_17_3
class MainTread {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method main of class MainThread started");

        int[] myArray = new int[1000];

        MySumCountThread msc1 = new MySumCountThread();
        MySumCountThread msc2 = new MySumCountThread();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            myArray[i] = random.nextInt(1000);
        }

        msc1.setStartIndex(45);
        msc1.setStopIndex(187);
        msc1.setArrInt(myArray);
        msc1.start();
        System.out.println("Thread msc1 started");

        try {
            msc1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread msc1 finished");

        msc2.setStartIndex(567);
        msc2.setStopIndex(781);
        msc2.setArrInt(myArray);
        msc2.start();
        System.out.println("Thread msc2 started");

        try {
            msc2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread msc2 finished");

        System.out.println("Method main of class MainThread finished");
    }
}


// lab2_17_4
class MySumCountRunnable implements Runnable {
    private int startIndex, stopIndex;

    private int[] arrInt;

    private long resultSum = 0;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public void setArrInt(int[] arrInt) {
        this.arrInt = arrInt;
    }

    public long getResultSum() {
        return resultSum;
    }

    @Override
    public void run() {

        System.out.print("[");

        for (int i = startIndex; i <= stopIndex; i++ ) {

            if (((i-startIndex)%20 == 0) && (i != startIndex)) System.out.println();

            if (i != stopIndex) {
                System.out.print(arrInt[i] + ", ");
            } else {
                System.out.print(arrInt[i]);
            }

            resultSum += arrInt[i];
        }
        System.out.println("]");
        System.out.println("Sum of array elements : " + resultSum);
    }
}

// lab2_17_4
class MainTreadRunnable {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Method main of class MainRunnable started");

        int[] myArray = new int[1000];

        MySumCountRunnable msc1 = new MySumCountRunnable();
        MySumCountRunnable msc2 = new MySumCountRunnable();

        Thread thread1 = new Thread(msc1);
        Thread thread2 = new Thread(msc2);

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            myArray[i] = random.nextInt(1000);
        }

        msc1.setStartIndex(45);
        msc1.setStopIndex(187);
        msc1.setArrInt(myArray);
        thread1.start();
        System.out.println("thread1 started");

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread1 finished");

        msc2.setStartIndex(567);
        msc2.setStopIndex(781);
        msc2.setArrInt(myArray);
        thread2.start();
        System.out.println("thread2 started");

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread2 finished");

        System.out.println("Method main of class MainRunnable finished");
    }
}
