package com.navya;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCustomSort {

    public static void main(String[] args) {


        Map<Integer,String> map = new TreeMap<>(new MyComparator());


        map.put(3,"Navya");
        map.put(2,"sree");
        map.put(5, "bhavya");



        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer int1, Integer int2) {

            return int1.compareTo(int2);
        }
    }
}
