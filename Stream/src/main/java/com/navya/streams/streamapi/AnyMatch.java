package com.navya.streams.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class AnyMatch {
    public static void main(String[] args) {


        List<Integer> values = List.of(10,2,3,6,4,7,11);


        boolean numbers = values.stream().anyMatch(value->value>2);
        System.out.println(numbers);
    }
}
