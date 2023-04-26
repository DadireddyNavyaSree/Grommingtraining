package com.navya.strategy;

public class App {
    public static void main(String[] args) {

        OperationManager manager = new OperationManager();
        manager.setStrategy(new Division());
        manager.execute(10 , 5);
    }
}
