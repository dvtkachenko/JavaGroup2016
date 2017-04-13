package com.brainacad.module2_17.lab.test_thread3;

/**
 * Created by Дима on 23.02.2017.
 */

// lab2_17_5

class Store {
    private int count = 0;
    private boolean counted = false;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }
}

class Counter extends Thread {
    private  Store store;

    Counter (Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println("Thread Counter started");
        while(!isInterrupted()) {
            synchronized (store) {
                try {
                    while (store.isCounted()) {
                    System.out.println("Thread Counter is waiting");
                    store.wait();
                    System.out.println("Thread Counter is increasing count");
                    }
                } catch (InterruptedException e) {
                    return;
                }
                int temp = store.getCount();
                temp++;
                store.setCount(temp);
                System.out.println("Increased Counter = " + temp);
                store.notifyAll();
                store.setCounted(true);
            }
        }
        System.out.println("Thread Counter finished");
    }
}

class Printer extends Thread {
    private Store store;

    Printer (Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        System.out.println("Thread Printer started");
        while(!isInterrupted()) {
            synchronized (store) {
               try {
                   while (!store.isCounted()) {
                       System.out.println("Thread Printer is waiting");
                       store.wait();
                       System.out.println("Thread Printer is printing count");
                   }
               } catch (InterruptedException e) {
                   return;
               }
               System.out.println("Printer = " + store.getCount());
               store.notifyAll();
               store.setCounted(false);
            }
        }
        System.out.println("Thread Printer finished");
    }
}

// lab2_17_5
public class Main {
    public static void main(String[] args) {

        System.out.println("Method main of class MainLocalhost started");

        Store store = new Store();
        Counter counter = new Counter(store);
        Printer printer = new Printer(store);

        counter.start();
        printer.start();

        System.out.println("Method main of class MainLocalhost finished");
    }
}
