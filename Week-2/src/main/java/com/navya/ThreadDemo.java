package com.navya;

import java.util.ArrayList;

public class ThreadDemo {
    public static void main(String[] args) {

        ArrayList<Runnable> runnables = new ArrayList<>();
        runnables.add(new MyRunnable("Thread 1"));
        runnables.add(new MyRunnable("Thread 2"));
        runnables.add(new MyRunnable("Thread 3"));


        ArrayList<Thread> threads = new ArrayList<>();
        for (Runnable runnable : runnables) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }


        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("All threads completed.");
    }
}

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println("Thread " + threadName + " started.");

        System.out.println("Thread " + threadName + " finished.");
    }
}
