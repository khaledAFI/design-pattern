package com.klead.dp.structural.composite;

import org.junit.Test;

/**
 * Created by kafi on 14/03/2016.
 */
public class TestComposite {

    @Test
    public void testComposite(){
        Component tri = new Triangle();
        Component tri1 = new Triangle();
        Component cir = new Circle();
        Composite composite = new Composite();
        composite.add(tri1);
        composite.add(tri1);
        composite.add(cir);
        composite.draw("Red");
        composite.clear();
        composite.add(tri);
        composite.add(cir);
        composite.draw("Green");
    }
}
