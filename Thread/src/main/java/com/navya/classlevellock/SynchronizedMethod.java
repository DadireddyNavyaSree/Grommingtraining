package com.navya.classlevellock;

public class SynchronizedMethod extends Thread{

    @Override
    public void run(){
        methodLock();
    }

    public static synchronized void methodLock(){
        System.out.println(
                Thread.currentThread().getName() + " entered methodLock()");
        System.out.println("Executing the task");
        System.out.println(Thread.currentThread().getName() + " at end of methodLock()");
    }

    public static void main(String[] args) {
        SynchronizedMethod thread1 = new SynchronizedMethod();
        SynchronizedMethod thread2 = new SynchronizedMethod();
        thread1.start();
        thread2.start();
    }
}
