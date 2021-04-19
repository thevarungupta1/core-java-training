package com.thevarungupta.day6;

/**
 * join()
 * This method wait for a thread to die
 * current running thread to stop executing untill the thread it joins will complete it task
 */

class ThreadJoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println(i);
        }
    }
}

public class Demo6 {
    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        ThreadJoinDemo t3 = new ThreadJoinDemo();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();
        // t1 completes then t2 and t3 start execution

    }
}
