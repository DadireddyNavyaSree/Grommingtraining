package com.navya.streams.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        for(int i=0; i<=10; i++){
            l1.add(i);
        }

        System.out.println(l1);

        List<Integer> l2 = l1.stream().filter(i->i%2==0).distinct()
                .collect(Collectors.toList());

        System.out.println("Even numbers are : " + l2);
    }
}
