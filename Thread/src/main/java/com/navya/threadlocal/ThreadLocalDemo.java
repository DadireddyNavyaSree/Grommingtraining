package com.navya.threadlocal;

public class ThreadLocalDemo {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(123);

        Thread t1 = new Thread(() -> {
            threadLocal.set(456);
            System.out.println("Thread 1 - Value is " + threadLocal.get());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 - Value is " + threadLocal.get());
        });

        t1.start();
        t2.start();

        System.out.println("Main Thread - Value is " + threadLocal.get());
    }
}
