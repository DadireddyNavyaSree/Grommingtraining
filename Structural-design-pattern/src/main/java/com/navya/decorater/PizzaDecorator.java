package com.navya.decorater;

//base decorated

public class PizzaDecorator implements Pizza{

    private Pizza pizza ;

    public PizzaDecorator (Pizza pizza) {
        this.pizza = pizza;

    }
    public void bake() {
        pizza.bake();
    }
}
