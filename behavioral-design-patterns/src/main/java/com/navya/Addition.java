package com.navya;

import com.navya.strategy.Strategy;

public class Addition implements Strategy {

    public void execute(int num1 , int num2) {

        System.out.println(num1 + num2);
    }
}
