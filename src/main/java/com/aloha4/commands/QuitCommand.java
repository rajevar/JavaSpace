package com.aloha4.commands;

import com.aloha4.AppContext;

public class QuitCommand implements Command {
    @Override
    public void execute(AppContext context) {
        System.out.println("Executing Quit command");
        System.exit(1);
    }
}
