package com.navya.streams.streamapi;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9,10);

//        for(int i =0; i<=10; i++ ) {
//            l1.add(i);
//        }
//                System.out.println(l1);


        l1.stream().forEach(System.out::println);

//        System.out.println("Even number : " + l1);
            }
        }

