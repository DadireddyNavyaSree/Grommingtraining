package com.navya.singleton;

public class DateUtilThreadSafe {

    private static volatile DateUtilThreadSafe instance;

    private DateUtilThreadSafe() {

    }

    // to check its thread-safe or not we can use synchronized
    // make sure this method accesed only by one thread at a time
    // using synchronized blocks so that it will aquire lock on object , class level lock

    public static  DateUtilThreadSafe getInstance(){
        if(instance == null) {
            synchronized (DateUtilThreadSafe.class) {
                if (instance == null) {
                    instance = new DateUtilThreadSafe();
                }
            }
        }
        return instance;
    }
}



//    public static synchronized DateUtilThreadSafe getInstance(){
//        if(instance == null) {
//            instance = new DateUtilThreadSafe();
//        }
//        return instance;
//    }