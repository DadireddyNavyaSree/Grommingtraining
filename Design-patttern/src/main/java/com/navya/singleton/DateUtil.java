package com.navya.singleton;

public class DateUtil {             //Lazily intialization

    private static DateUtil instance;

    private DateUtil(){             // create private constructor , no other classes will be able to instatied directly to this class

    }

    public static DateUtil getInstance(){
        if(instance == null ) {
            instance = new DateUtil();
        }
       return instance;
    }
}



// eager intialization , helps if we are pretty sure that our class will be used atleast once in application
//    private static DateUtil instance = new DateUtil();
//
//    private DateUtil(){             // create private constructor , no other classes will be able to instatied directly to this class
//
//    }
//
//    public static DateUtil getInstance(){
//        return instance;
//    }



//other way to use using static blocks
//private static DateUtil instance;
//
//static {
//    instance = new DateUtil();   //static blocks are executed when class is loaded into memory
//        }
//
//    private DateUtil(){             // create private constructor , no other classes will be able to instatied directly to this class
//
//    }
//
//    public static DateUtil getInstance(){
//        return instance;
//    }