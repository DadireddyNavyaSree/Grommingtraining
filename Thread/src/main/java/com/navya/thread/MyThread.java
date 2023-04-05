package com.navya.thread;


public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Task executed.");
    }

    public static void main(String[] args) {
         MyTask task = new MyTask();
        Thread thread = new Thread(String.valueOf(task));
        thread.start();
    }
}

