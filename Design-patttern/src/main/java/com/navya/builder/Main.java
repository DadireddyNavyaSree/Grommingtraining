package com.navya.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .setDough("thin crust")
                .setSauce("tomato")
                .setTopping("pepperoni")
                .build();
        System.out.println("Pizza details: ");
        System.out.println("Dough: " + pizza.getDough());
        System.out.println("Sauce: " + pizza.getSauce());
        System.out.println("Topping: " + pizza.getTopping());
    }
}
