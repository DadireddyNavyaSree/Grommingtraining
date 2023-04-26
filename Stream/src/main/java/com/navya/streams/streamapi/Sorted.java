package com.navya.streams.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> values = List.of(1,2,3,4,5,6,7,8,9,10);


        List<Integer> num = values.stream().sorted().collect(Collectors.toList());
        System.out.println("Numbers are : " + num);

        List<Integer> nums = values.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Numbers are : " + nums);
    }
}
