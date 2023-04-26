package com.navya.streams.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Limit {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10,2,3,4,5,1,7,20,3,5);

        List<Integer>numbers = nums.stream().limit(4).collect(Collectors.toList());
        System.out.println(numbers);
    }
}
