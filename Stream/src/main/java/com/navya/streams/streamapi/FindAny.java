package com.navya.streams.streamapi;

import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<Integer> values = List.of(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> nums = values.stream().findAny();

        System.out.println("The element :" + nums.get());
    }
}
