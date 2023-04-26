package com.navya.singleton;

import java.io.Serializable;

public class Serialization implements Serializable,Cloneable {
    private static volatile Serialization instance;

    private Serialization() {

    }

    public static Serialization getInstance(){
        if(instance == null) {
            synchronized (Serialization.class) {
                if (instance == null) {
                    instance = new Serialization();
                }
            }
        }
        return instance;
    }

    // to solve serialization issue we need to give readResolve method

    protected Object readResolve(){
        return instance;
    }

    // we dont want to clone our singleton classes objects to be cloned

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }
}
