package com.klead.dp.structural.proxy;

import org.junit.Test;

/**
 * Created by kafi on 14/03/2016.
 */
public class TestCommandExecutorProxy {
    @Test
    public void testRunCommand(){
        CommandExecutor executor = new CommandExecutorProxy("kafi","password");
        try {
            executor.runCommand("cmd");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
