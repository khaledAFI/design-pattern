package com.klead.dp.structural.flyweight;

import java.awt.*;

/**
 * Created by kafi on 14/03/2016.
 */
public class Line implements Shape {
    public Line() {
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
        line.setColor(color);
        line.drawLine(x1, y1, x2, y2);
    }
}
