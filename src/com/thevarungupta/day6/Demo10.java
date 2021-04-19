package com.thevarungupta.day6;

/**
 * Inter thread communication
 * IT all about co-operation or allowing synchorized thread to communicate with each other
 * wait() - current thread to release the lock and wait until either another thread invoke notify
 * notify() - to get an update from the thread
 * notifyAll()
 *
 * **/
class Bank{
    int balance = 1000;

    synchronized public void withdraw(int amount){
        System.out.println("Withdraw processing....");
        if(balance < amount){
            //System.out.println("Balance insufficient, waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("Withdraw competed!!");
        }
    }

    synchronized public void deposit(int amount){
        System.out.println("deposit processing...");
        balance += amount;
        System.out.println("deposit completed!!");
        notify();
    }
}

class DepositThread extends Thread{
    Bank bank;
    public DepositThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(10000);
    }
}

class WithdrawThread extends Thread{
    Bank bank;

    public WithdrawThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(15000);
    }
}


public class Demo10 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        DepositThread depositThread = new DepositThread(bank);
        WithdrawThread withdrawThread = new WithdrawThread(bank);


        withdrawThread.start();
        depositThread.start();
    }
}
