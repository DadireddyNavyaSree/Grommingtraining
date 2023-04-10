package com.navya.callable;

import java.util.concurrent.Callable;
public class MyTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // Perform some time-consuming computation here
        Thread.sleep(5000);
        return 42;
    }

    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask();

        Integer result = task.call();

        System.out.println("Result of the computation is: " + result);
    }
}

