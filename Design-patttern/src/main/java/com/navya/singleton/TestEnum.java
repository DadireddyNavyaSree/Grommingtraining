package com.navya.singleton;

public class TestEnum {
    public static void main(String[] args) {
//        Enums enums = (Enums) Enums.INSTANCE;
        Enums instance = Enums.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Navya");
        System.out.println(instance.getName());
    }
}
