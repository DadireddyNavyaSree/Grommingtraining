package com.navya.interrupt;

public class InterruptDemo {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
        t.interrupt();
        System.out.println("End of the main method");
    }
}
