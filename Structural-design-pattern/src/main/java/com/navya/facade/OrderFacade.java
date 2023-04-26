package com.navya.facade;

public class OrderFacade {
    public void processOrder(String name , int quantity) {
        OrderProcessor op = new OrderProcessor();
        if(op.checkStock(name)) {
            String orderId =  op.placeOrder(name , quantity);
            op.shipOrder("abc123");
        }
    }
}
