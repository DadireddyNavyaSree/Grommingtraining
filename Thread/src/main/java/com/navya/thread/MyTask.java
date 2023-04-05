package com.navya.thread;

public class MyTask implements Runnable {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Task executed.");
    }


}
