package com.thevarungupta.day5;

class MultiThreadDemo2 implements Runnable{


    @Override
    public void run() {
        System.out.println("thread is running...");

    }
}

public class Demo10 {
    public static void main(String[] args) {
        MultiThreadDemo2 threadDemo2 = new MultiThreadDemo2();


        Thread thread = new Thread(threadDemo2);

        thread.start();
    }
}
