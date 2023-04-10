package com.navya.thread;

public class ThreeThreadsPrinting implements Runnable {
    private final int threadId;
    private final int maxCount;
    private static volatile int currentCount = 1;
    private static final Object lock = new Object();

    public ThreeThreadsPrinting(int threadId, int maxCount) {
        this.threadId = threadId;
        this.maxCount = maxCount;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (currentCount > maxCount) {
                    return;
                }
                if (currentCount % 3 == threadId) {
                    System.out.println(Thread.currentThread().getName()+ " : " + currentCount);
                    currentCount++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int maxCount = 10;
        ThreeThreadsPrinting thread1 = new ThreeThreadsPrinting(1, maxCount);
        ThreeThreadsPrinting thread2 = new ThreeThreadsPrinting(2, maxCount);
        ThreeThreadsPrinting thread3 = new ThreeThreadsPrinting(0, maxCount);
        Thread t1 = new Thread(thread1, "Thread-1");
        Thread t2 = new Thread(thread2, "Thread-2");
        Thread t3 = new Thread(thread3, "Thread-3");


        t1.start();

        t2.start();

        t3.start();

    }
}

