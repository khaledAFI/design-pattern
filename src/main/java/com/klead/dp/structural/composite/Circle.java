package com.klead.dp.structural.composite;

/**
 * Leaf implements base component and these are the building block for the composite.
 * Created by kafi on 14/03/2016.
 */
public class Circle implements Component {
    public void draw(String fillColor) {
        System.out.println("Component Circle with color " + fillColor);
    }
}
