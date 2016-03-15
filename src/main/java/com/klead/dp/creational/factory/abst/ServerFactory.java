package com.klead.dp.creational.factory.abst;

import com.klead.dp.creational.factory.Computer;
import com.klead.dp.creational.factory.Server;

/**
 * Created by kafi on 14/03/2016.
 */
public class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }
}
