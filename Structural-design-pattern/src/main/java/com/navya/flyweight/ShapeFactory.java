package com.navya.flyweight;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<Color, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(Color color) {
        Shape circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }

        return circle;
    }
}
