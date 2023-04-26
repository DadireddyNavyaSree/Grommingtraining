package com.navya.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntroduction {
    public static void main(String[] args) {
        List<Integer> temperature;
        temperature = List.of(16,17,20,15,20,17,19);

        System.out.println(
        temperature.stream().filter(temparatures->(temparatures > 16)).collect(Collectors.toList()));

       System.out.println(temperature.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

//        temperature.stream().sorted().collect(Collectors.toList());
//        System.out.println(temperature);

        System.out.println(temperature.stream().filter(temperatures->temperatures>16).filter(temperatures->temperatures<19).count());

    }
}
