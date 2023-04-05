package com.navya.thread;

public class TwoThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 started");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 finished");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 started");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 finished");
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish executing
        t1.join();
        t2.join();

        System.out.println("All threads have finished, exiting main thread");
    }
}
