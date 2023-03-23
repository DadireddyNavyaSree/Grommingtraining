package com.navya;

public class Autoboxing {
    public static void main(String[] args) {
        // autoboxing - converting primitive int to Integer object
        Character c1 = 'A';

        // unboxing - converting Integer object to primitive int
        char c2 = c1;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // autoboxing - converting primitive double to Double object
        Double d1 = 7.12;

        // unboxing - converting Double object to primitive double
        double d2 = d1;

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
    }
}

