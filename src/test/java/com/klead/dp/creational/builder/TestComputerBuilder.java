package com.klead.dp.creational.builder;

import org.junit.Test;

/**
 * Created by kafi on 14/03/2016.
 */
public class TestComputerBuilder {

    @Test
    public void testBuilder() {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
    }
}
