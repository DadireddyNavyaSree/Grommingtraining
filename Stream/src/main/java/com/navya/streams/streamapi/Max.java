package com.navya.streams.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Max {
    public static void main(String[] args) {
        List<Integer> m = List.of(2,3,10,15,20,35,0);

        Optional<Integer> num = m.stream().max(Comparator.naturalOrder());
        System.out.println("Maximum number : " + num.get());

    }
}
