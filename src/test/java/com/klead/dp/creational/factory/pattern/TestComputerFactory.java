package com.klead.dp.creational.factory.pattern;

import com.klead.dp.creational.factory.Computer;
import com.klead.dp.creational.factory.PC;
import com.klead.dp.creational.factory.Server;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class TestComputerFactory {

    @Test
    public void testFactory() {

        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500GB", " 2.4 GHz ");

        Computer server = ComputerFactory.getComputer("server", "16GB", "1TB", " 2.9 GHz ");

        Assert.assertTrue(pc instanceof PC);
        Assert.assertTrue(server instanceof Server);

        System.out.println("Factory PC Config::" + pc);

        System.out.println("Factory Server Config::" + server);

    }
}
