package com.navya.singleton;

public class TestThreadSafe {
    public static void main(String[] args) {
        DateUtilThreadSafe dateUtilThreadSafe1 = DateUtilThreadSafe.getInstance();
        DateUtilThreadSafe dateUtilThreadSafe2 = DateUtilThreadSafe.getInstance();


        System.out.println(dateUtilThreadSafe1 == dateUtilThreadSafe2);
    }
}
