package com.navya.demonthread;

public class DaemonThread extends Thread{

    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){

            System.out.println("Daemon Thread is running");
        }
        else{
            System.out.println("Normal Thread is running");
        }
    }

    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Daemon Thread");
        daemonThread.setDaemon(true);
        daemonThread.start();

        DaemonThread normalThread = new DaemonThread();
        normalThread.setName("Normal Thread");
        normalThread.start();
    }

}
