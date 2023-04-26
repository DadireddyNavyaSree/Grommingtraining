package com.navya.decorater;

public class VeggiePizzaDecorator extends PizzaDecorator {

    public VeggiePizzaDecorator(Pizza pizza) {

        super(pizza);
    }

    // this where we are decorting the plainpizza by adding veggie toppings on it or whatever pizza
    public void bake() {

        super.bake();
        System.out.println("Adding veggie toppings");
    }
}
