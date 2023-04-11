package com.navya.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1); // Initialize semaphore with 1 permit
        Thread thread1 = new Thread(new Worker(semaphore, "Thread 1"));
        Thread thread2 = new Thread(new Worker(semaphore, "Thread 2"));
        Thread thread3 = new Thread(new Worker(semaphore, "Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    private static class Worker implements Runnable {
        private final Semaphore semaphore;
        private final String name;

        public Worker(Semaphore semaphore, String name) {
            this.semaphore = semaphore;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire(); // acquire a permit from the semaphore
                System.out.println(name + " acquired a permit.");
                Thread.sleep(1000); // simulate some work
                System.out.println(name + " releasing the permit.");
                semaphore.release(); // release the permit back to the semaphore
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

