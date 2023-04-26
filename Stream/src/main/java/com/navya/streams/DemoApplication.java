package com.navya.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Java 8 Streams map() example
// Converting a List of Integers to a List of String
public class DemoApplication {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.
                asList(33, 6, 11, 8, 44, 33, 8);

        //Converting a List of Integers to a List of String
        List<String> strNumbers = numbers.stream().
                map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(strNumbers);

    }
}