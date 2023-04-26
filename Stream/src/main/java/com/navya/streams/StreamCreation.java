package com.navya.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        List<String> musicStyles = List.of("Rock" , "Trance" , "Pop" , "Blues" , "Classical music");

        // onw way to create stream like : .stream()
        musicStyles.stream().sorted().forEach(musicStyle->System.out.println(musicStyle));

        //2 way to create stream : stream.of() every element must have same data type , it take any kind of data
        System.out.println(Stream.of("\"Rock\" , \"Trance\" , \"Pop\" , \"Blues\" , \"Classical music\"").collect(Collectors.toList()));

        //3 way to create stream : arrays.stream() we can use double array to specify the following array
        System.out.println("Number of elements in the array : " + Arrays.stream(new double[] {12.9 , 3.5 , 6.2, 8.4 ,4.8}).count());

        //4 way to create stream : IntStream.range() , range take 2 params like inclusive and exclusive(start and end number)
        // for double stream this range wont be available

        IntStream.range(0 , musicStyles.size()).forEach(number->System.out.println((number +1) + "." +musicStyles.get(number)));
    }
}
