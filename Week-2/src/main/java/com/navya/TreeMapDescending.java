package com.navya;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDescending {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<Integer, String>((o1, o2) -> o2.compareTo(o1));

        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");


        System.out.println("Original entries in the TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        Map<Integer, String> descendingMap = new TreeMap<Integer, String>((o1, o2) -> o2.compareTo(o1));
        descendingMap.putAll(map);

        System.out.println("\nEntries in the TreeMap sorted in descending order:");
        for (Map.Entry<Integer, String> entry : descendingMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

