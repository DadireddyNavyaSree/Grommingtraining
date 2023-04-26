package com.navya.streams.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,4,4,5,6,7,2,3,10);

        List<Integer> numbers = nums.stream().distinct().collect(Collectors.toList());
        System.out.println(numbers);
    }
}
