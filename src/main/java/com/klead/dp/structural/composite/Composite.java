package com.klead.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A composite object contains group of leaf objects and we should provide
 * some helper methods to add or delete leafs from the group. We can also
 * provide a method to remove all the elements from the group.
 * Composite pattern should be applied only when the group of objects
 * should behave as the single object.
 * Composite pattern can be used to create a tree like structure.
 * Created by kafi on 14/03/2016.
 */
public class Composite implements Component {
    //collection of Shapes
    private List<Component> shapes = new ArrayList<Component>();

    //    composite also implements component and behaves similar to
    //    leaf except that it can contain group of leaf elements.
    public void draw(String fillColor) {
        System.out.println("***********************************");
        System.out.println("Composite with color " + fillColor);
        for (Component sh : shapes) {
            sh.draw(fillColor);
        }
    }

    //adding shape to drawing
    public void add(Component s) {
        this.shapes.add(s);
    }

    //removing shape from drawing
    public void remove(Component s) {
        shapes.remove(s);
    }

    //removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
