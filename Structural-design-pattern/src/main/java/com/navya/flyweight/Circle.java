package com.navya.flyweight;

import java.awt.*;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
        System.out.println("Creating circle with color: " + color);
    }

    public void draw(int x, int y) {
        System.out.println("Drawing circle at (" + x + "," + y + ") with color: " + color);
    }

    @Override
    public void draw() {

    }
}
