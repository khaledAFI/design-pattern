package com.klead.dp.creational.factory.abst;

import com.klead.dp.creational.factory.Computer;
import com.klead.dp.creational.factory.PC;

/**
 * Created by kafi on 14/03/2016.
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
