package com.klead.dp.structural.flyweight;

import java.awt.*;

/**
 * Created by kafi on 14/03/2016.
 */
public interface Shape {
    void draw(Graphics g, int x, int y, int width, int height, Color color);
}
