package com.brainacad.module2_17.lab.test_thread5;

/**
 * Created by Дима on 27.02.2017.
 */

// lab2_17_7
class Bank {
            private int accounts[]; 
            private int numOfAccounts; 
            public Bank(int num_accounts, int init_balance) { 
        accounts = new int[num_accounts]; 
        numOfAccounts = num_accounts; 
        for (int i = 0; i < accounts.length; i++) { 
            accounts[i] = init_balance; 
        } 
    } 
            void transfer(int from, int to, int amount) { 
        try { 
            System.out.println("from: " + from + " to: " + to + 
                                    " amount: " + amount); 
 
            if (accounts[from] < amount) return; 
            accounts[from] = accounts[from] - amount; 
            Thread.sleep((int)(100*Math.random())); 
            accounts[to] = accounts[to] + amount; 
 
            System.out.println("Total balance: " + totalBalance()); 
 
        } catch (InterruptedException e) { 
 
        } 
    } 
            public int totalBalance() { 
        int total = 0; 
        for (int v : accounts) { 
            total = total + v; 
        } 
        return total; 
    } 
            public int getNumberAccounts() { 
        return numOfAccounts; 
    } 
} 
         
class Transfer {
            private Bank bank; 
            private int from; 
            private int max; 
            public Transfer(Bank bank, int from, int max_amount) { 
        this.bank = bank; 
        this.from = from; 
        max = max_amount; 
    } 
} 
         
class BankTest {
            public static final int N_ACCOUNTS = 5; 
            public static final int INIT_BALANCE = 1000; 
             
            public static void main(String args[]) { 
        //... 
        // COMPLETE 
        //.. 
    } 
} 

// lab2_17_7
public class Main {
    public static void main(String[] args) {

    }
}
