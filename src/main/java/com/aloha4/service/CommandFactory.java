package com.aloha4.service;

import com.aloha4.commands.Command;
import com.aloha4.enums.CommandType;

public class CommandFactory {

    private static CommandFactory commandFactory = null;
    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        if(commandFactory == null) {
            commandFactory = new CommandFactory();
        }
        return commandFactory;
    }

    public Command getCommand(CommandType command)  {
        return command.getCommand();
    }
}
