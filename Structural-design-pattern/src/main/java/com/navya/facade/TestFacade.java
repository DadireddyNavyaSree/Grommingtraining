package com.navya.facade;

public class TestFacade {
    public static void main(String[] args) {

       OrderFacade facade = new OrderFacade();
       facade.processOrder("MacBook" , 3);
       facade.processOrder("Apple", 5);
    }
}
