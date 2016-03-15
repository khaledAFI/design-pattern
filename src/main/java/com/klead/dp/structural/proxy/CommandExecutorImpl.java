package com.klead.dp.structural.proxy;

import java.io.IOException;

/**
 * The class that we want to control access to it
 * Created by kafi on 14/03/2016.
 */
public class CommandExecutorImpl implements CommandExecutor {
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
