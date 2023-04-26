package com.navya.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Ref;

public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflection instance1 = Reflection.getInstance();
        Reflection instance2 = null;

        Constructor[] Constructors = Reflection.class.getDeclaredConstructors();

        for (Constructor constructor : Constructors) {
            constructor.setAccessible(true);

            instance2 = (Reflection) constructor.newInstance();
            break;
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());


    }



    private static Reflection getInstance() {
        Reflection instance = new Reflection();
        return instance;

    }

}
