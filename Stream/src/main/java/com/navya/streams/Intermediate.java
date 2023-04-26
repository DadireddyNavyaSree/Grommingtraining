package com.navya.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Intermediate {

        public static void main(String args[]) throws InterruptedException, ExecutionException {
            List<String> laptopList = new ArrayList();
            laptopList.add("DELL");
            laptopList.add("ACER");
            laptopList.add("HCL");

            // Intermediate operation
            laptopList.sort((p1, p2) -> p1.compareTo(p2));
            System.out.println(laptopList);

            // Terminal Operation
            laptopList.forEach(a -> {
                System.out.println(a);
            });
        }
    }

