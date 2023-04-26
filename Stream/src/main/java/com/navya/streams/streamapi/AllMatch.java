package com.navya.streams.streamapi;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> values = List.of(10,3,4,2,7,9,4,9,10,24);

        boolean number = values.stream().allMatch(value->value>1);
        System.out.println(number);


    }
}
