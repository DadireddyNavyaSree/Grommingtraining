package com.navya.decorater;

public class CheesePizzaDecorator extends PizzaDecorator {

    public CheesePizzaDecorator(Pizza pizza) {

        super(pizza);
    }

    // this where we are decorting the plainpizza by adding veggie toppings on it or whatever pizza
    public void bake() {

        super.bake();
        System.out.println("Adding cheese toppings");
    }
}
