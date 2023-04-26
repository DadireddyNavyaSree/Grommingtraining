package com.navya.streams.streamapi;

import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> values = List.of(2,5,8,2,4,6);

        List<String> names = List.of("Navya" , "Sree" , "vaishnavi" , "java");

        String namesLength = ((names.stream().reduce(String.valueOf(0), (str1, str2) -> String.valueOf((str1.length() < str2.length())))));

        System.out.println("The length of the String : " + namesLength.length());

        Optional<Integer> sumOfAll = values.stream().reduce((element1 , element2)-> element1 + element2);

        System.out.println("The sum of all :" + sumOfAll.get());
    }
}
