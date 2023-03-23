package com.navya;

class Flower {
    public void showcase () {
        System.out.println("Flowers");
    }

    public void displayColor(String color) {
        System.out.println("This flower is " + color);
    }
}

class Rose extends Flower {
    @Override
    public void showcase () {
        System.out.println("Rose");
    }

    public void displayColor() {
        System.out.println("This rose is red");
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Flower flowers = new Flower();
        flowers.showcase();
        flowers.displayColor("pink");

        Rose rose = new Rose();
        rose.showcase();
        flowers.showcase();
        rose.displayColor();
    }
}
