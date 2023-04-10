package com.navya.thread;

import java.util.concurrent.CountDownLatch;

public class MainTask {
    public static void main(String[] args) throws InterruptedException {
        int numSubTasks = 3;
        CountDownLatch latch = new CountDownLatch(numSubTasks);

        // create and start subtasks
        for (int i = 0; i < numSubTasks; i++) {
            SubTask subTask = new SubTask(latch);
            subTask.start();
        }

        // wait for all subtasks to complete
        latch.await();

        // start main task
        System.out.println("Main task starting...");
    }
}

class SubTask extends Thread {
    private CountDownLatch latch;

    public SubTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        // do subtask work
        System.out.println("Subtask " + Thread.currentThread().getName() + " starting...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Subtask " + Thread.currentThread().getName() + " completed.");
        // decrement count on latch to signal completion of subtask
        latch.countDown();
    }
}

