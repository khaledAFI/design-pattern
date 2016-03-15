package com.klead.dp.structural.adapter;

/**
 * Producing constant volts of 120V.
 * Created by kafi on 14/03/2016.
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
