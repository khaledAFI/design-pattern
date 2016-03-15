package com.klead.dp.creational.factory.pattern;

import com.klead.dp.creational.factory.Computer;
import com.klead.dp.creational.factory.PC;
import com.klead.dp.creational.factory.Server;

/**
 * Created by kafi on 14/03/2016.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        Computer cp = null;

        if ("PC".equalsIgnoreCase(type)) {
            cp = new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            cp = new Server(ram, hdd, cpu);
        }
        return cp;
    }
}
