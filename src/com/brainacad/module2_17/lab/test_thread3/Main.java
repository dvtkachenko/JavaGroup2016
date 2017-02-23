package com.brainacad.module2_17.lab.test_thread3;

/**
 * Created by Дима on 23.02.2017.
 */

// lab2_17_5

class Store {
    private int count = 0;
    private boolean ready = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}

class Counter extends Thread {
    private Store store;

    Counter (Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(!isInterrupted()) {
            synchronized (store) {
                try {
                    while (!store.isReady()) {
                        store.wait();
                    }
                } catch (InterruptedException e) {
                    return;
                }
                store.setReady(false);
                int temp = store.getCount();
                temp++;
                store.setCount(temp);
                System.out.println("Counter = " + temp);
                store.setReady(true);
                store.notifyAll();
            }
        }
    }
}

class Printer extends Thread {
    private Store store;

    Printer (Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while(!isInterrupted()) {
            synchronized (store) {
               try {
                   while(!store.isReady()) { store.wait(); }
               } catch (InterruptedException e) {
                   return;
               }
               store.setReady(false);
               System.out.println("Printer = " + store.getCount());
               store.setReady(true);
               store.notifyAll();
            }
        }
    }
}

// lab2_17_5
public class Main {
    public static void main(String[] args) {

        System.out.println("Method main of class Main started");

        Store store = new Store();
        Counter counter = new Counter(store);
        Printer printer = new Printer(store);

        counter.start();
        printer.start();
/**
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        counter.interrupt();
        printer.interrupt();
*/
        System.out.println("Method main of class Main finished");
    }
}
