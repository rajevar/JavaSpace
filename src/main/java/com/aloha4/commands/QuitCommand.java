package com.aloha4.commands;

import com.aloha4.AppContext;

public class QuitCommand extends AbstractCommand {

    @Override
    public void run() {
        System.out.println("Executing Quit command");
        System.exit(1);
    }
}
