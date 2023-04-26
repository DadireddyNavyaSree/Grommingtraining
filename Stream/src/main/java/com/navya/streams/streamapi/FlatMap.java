package com.navya.streams.streamapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        Integer[][] lotterNumbers = new Integer[][]{
                {5, 23, 54, 60, 22},
                {20, 35, 10, 44, 65},
                {2, 5, 19, 20, 39, 52},
        };

        Set<Integer> lotterNumbersSet = Stream.of(lotterNumbers)// array doesnt take stream.function
                .flatMap(Stream::of) //need to give method reference bcoz we need to combine those stream
                .distinct()    // remove duplicate values using distinct and set
                .collect(Collectors.toSet());

        System.out.println("The lottery numbers in the last 3 weeks :" + lotterNumbersSet);
    }

//    List<List<String>> fruits = List.of(
//            List.of("apple", "grapes", "kiwi"),
//            List.of("plum", "mango", "lemon")
//    );
//
//
//    List<String> fruitsList = fruits.stream()
//            .flatMap(Collection::stream)
//            .collect(Collectors.toList());
//
//    System.out.println("Available fruits: "+ fruitsList);
}


