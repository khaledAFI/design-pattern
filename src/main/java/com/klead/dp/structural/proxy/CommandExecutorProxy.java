package com.klead.dp.structural.proxy;

/**
 * Proxy pattern is used when we want to
 * provide controlled access of a functionality.
 * Created by kafi on 14/03/2016.
 */
public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("kafi".equals(user) && "password".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
