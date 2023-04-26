package com.navya.flyweight;

import java.awt.*;

public class Main {
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Shape circle = ShapeFactory.getCircle(getRandomColor());
            circle.draw(getRandomX(), getRandomY());
        }
    }

    private static Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
