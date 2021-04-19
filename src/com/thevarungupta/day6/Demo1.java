package com.thevarungupta.day6;

class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        System.out.println("thread 1 started...");
    }
}

class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        System.out.println("thread 2 started...");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        // by extending thread class
        ThreadDemo1 t1 = new ThreadDemo1();
        // implementing runnable interface
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread t2 = new Thread(threadDemo2);

        // start thread
        t1.start();
        t2.start();


    }
}
