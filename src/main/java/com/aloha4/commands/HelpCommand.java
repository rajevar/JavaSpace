package com.aloha4.commands;

import com.aloha4.AppContext;

public class HelpCommand implements Command {
    @Override
    public void execute(AppContext context) {
        System.out.println("Executes HelpCommand.." + context.getCurrentInput()[0]);
    }
}
