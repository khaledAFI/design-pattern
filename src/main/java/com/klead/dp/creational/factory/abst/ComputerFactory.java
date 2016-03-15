package com.klead.dp.creational.factory.abst;

import com.klead.dp.creational.factory.Computer;

/**
 * Created by kafi on 14/03/2016.
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
