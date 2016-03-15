package com.klead.dp.creational.factory.abst;


import com.klead.dp.creational.factory.Computer;
import com.klead.dp.creational.factory.PC;
import com.klead.dp.creational.factory.Server;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kafi on 14/03/2016.
 */
public class TestComputerAbstractFactory {

    @Test
    public void testFactory() {

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));

        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
        Assert.assertTrue(pc instanceof PC);
        Assert.assertTrue(server instanceof Server);
        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
