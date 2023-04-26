package com.navya.streams.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple" , "banana" , "grapes" , "kiwi");

        List<String > fruit = fruits.stream().skip(2).collect(Collectors.toList());
        System.out.println(fruit);
    }
}
