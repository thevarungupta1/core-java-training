package com.thevarungupta.day5;

class MultiThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}

public class Demo9 {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.start();
    }
}
