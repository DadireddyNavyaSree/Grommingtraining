package com.navya;


public class Movie {
    public static void main(String[] args) {
        System.out.println("name of movie  " +MovieEnum.CINEPOLIS.getName() + " and the price is " + MovieEnum.CINEPOLIS.getPrice());
        System.out.println("name of movie  " +MovieEnum.PVR.getName()+ " and the price is " + MovieEnum.PVR.getPrice());
        System.out.println("name of movie  " +MovieEnum.IMAX.getName() + " and the price is " + MovieEnum.IMAX.getPrice());
    }
}


