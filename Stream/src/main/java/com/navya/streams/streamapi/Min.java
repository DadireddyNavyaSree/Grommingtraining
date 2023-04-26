package com.navya.streams.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {
        List<Integer> m = List.of(10,20,35,2,3,28);

        Optional<Integer> numbers = m.stream().min(Comparator.naturalOrder());

        System.out.println("Min number are : " + numbers.get());

    }
}
