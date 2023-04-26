package com.navya.streams.streamapi;

import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {

        List<Integer> values = List.of(3,4,5,6,7,8,9);

        boolean nums = values.stream().noneMatch(value->value<2);
        System.out.println(nums);
    }
}
