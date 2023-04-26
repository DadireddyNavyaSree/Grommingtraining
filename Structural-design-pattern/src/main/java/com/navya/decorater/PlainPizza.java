package com.navya.decorater;

// concrete component

public class PlainPizza implements Pizza{

    public void bake() {
        System.out.println("Baking plain pizza");
    }
}
